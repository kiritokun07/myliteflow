package com.kirito.liteflow.ctl;

import com.yomahub.liteflow.core.FlowExecutor;
import com.yomahub.liteflow.flow.LiteflowResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
@Slf4j
public class TestController {

    @Resource
    private FlowExecutor flowExecutor;

    @GetMapping("/test1")
    public String test1() {
        return "Hello";
    }

    @GetMapping("/run1")
    public String run1() {
        log.info("run1");
        LiteflowResponse response = flowExecutor.execute2Resp("chain1", "arg");
        return "run1 success";
    }

}
