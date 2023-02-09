package com.kirito.liteflow.cmp;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;
import lombok.extern.slf4j.Slf4j;

@LiteflowComponent("a")
@Slf4j
public class ACmp extends NodeComponent {

    @Override
    public void process() throws Exception {
        log.info("a is running");
        Thread.sleep(100);
        log.info("a bye~");
    }

}
