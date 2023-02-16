package com.kirito.liteflow.cmp;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeSwitchComponent;
import lombok.extern.slf4j.Slf4j;

import java.util.Random;

@LiteflowComponent("e")
@Slf4j
public class ECmp extends NodeSwitchComponent {

    @Override
    public String processSwitch() {
        boolean b = new Random().nextBoolean();
        log.info("e print {}", b);
        return b ? "c" : "d";
    }

}
