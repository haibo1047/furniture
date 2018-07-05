package com.huiyi.meeting.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ylsq.common.base.BaseController;

import io.swagger.annotations.Api;

/**
 * ${modelname}controller
 * Created by shuzheng on 2018/7/3.
 */
@Controller
@RequestMapping("/manage")
public class MeetingRoomController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MeetingRoomController.class);

    @GetMapping("/test")
    public String test() {
    	return "";
    }

}