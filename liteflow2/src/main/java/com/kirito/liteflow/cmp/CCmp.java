package com.kirito.liteflow.cmp;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;
import lombok.extern.slf4j.Slf4j;

@LiteflowComponent("c")
@Slf4j
public class CCmp extends NodeComponent {

    @Override
    public void process() throws Exception {
        log.info("c is running");
        Thread.sleep(100);
        log.info("c bye~");
    }

}
