package com.example.demo.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.SecuUserMapper;
import com.example.demo.model.SecuUser;
import com.example.demo.model.SecuUserExample;
import com.example.demo.utils.SystemConstant;

@Service
public class SecuUserService implements UserDetailsService{
    @Autowired
    SecuUserMapper secuUserMapper;
    @Autowired
    SecuRoleService secuRoleService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SecuUserExample userExample = new SecuUserExample();
        userExample.createCriteria().andUserNameEqualTo(username);
        List<SecuUser> list = secuUserMapper.selectByExample(userExample);

        if(list != null && list.size() ==1){
            SecuUser su = list.get(0);
            List<String> roleNameList = secuRoleService.getRoleNamesByUserName(su.getUserName());
            return new CustomSecuUser(su, roleNameList);
        }
        return null;
    }

    public static class CustomSecuUser extends SecuUser implements UserDetails{

        private List<GrantedAuthority> grantedRoles = AuthorityUtils.NO_AUTHORITIES;
        
        public CustomSecuUser(SecuUser u, List<String> roleNameList) {
            setId(u.getId());
            setUserName(u.getUserName());
            setPassword(u.getPassword());
            if(roleNameList == null || roleNameList.size()==0 ){
                grantedRoles.add(new SimpleGrantedAuthority(SystemConstant.DEAULT_ROLE_NAME));
            }
            else{
                List<GrantedAuthority> tmpList = new ArrayList<GrantedAuthority>(roleNameList.size());
                for (String role : roleNameList) {
                    GrantedAuthority ga = new SimpleGrantedAuthority(role);
                    tmpList.add(ga);
                }
                setGrantedRoles(tmpList);
            }
        }

        @Override
        public Collection<? extends GrantedAuthority> getAuthorities() {
            return getGrantedRoles();
        }

        @Override
        public String getUsername() {
            return getUserName();
        }

        @Override
        public boolean isAccountNonExpired() {
            return true;
        }

        @Override
        public boolean isAccountNonLocked() {
            return true;
        }

        @Override
        public boolean isCredentialsNonExpired() {
            return true;
        }

        @Override
        public boolean isEnabled() {
            return true;
        }

        public List<GrantedAuthority> getGrantedRoles() {
            return grantedRoles;
        }

        public void setGrantedRoles(List<GrantedAuthority> grantedRoles) {
            this.grantedRoles = grantedRoles;
        }
    }
}
