package top.nyac.liteflow.components;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;

/**
 * @author NyaC
 * @since 2024/7/16
 */
@LiteflowComponent("b")
public class BComponent extends NodeComponent {
    @Override
    public void process() throws Exception {
        System.out.println("this is BComponent");
    }
}
