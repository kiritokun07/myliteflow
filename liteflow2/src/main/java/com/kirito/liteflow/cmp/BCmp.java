package com.kirito.liteflow.cmp;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;
import lombok.extern.slf4j.Slf4j;

@LiteflowComponent("b")
@Slf4j
public class BCmp extends NodeComponent {

    @Override
    public void process() throws Exception {
        log.info("b is running");
        Thread.sleep(100);
        log.info("b bye~");
    }

}
