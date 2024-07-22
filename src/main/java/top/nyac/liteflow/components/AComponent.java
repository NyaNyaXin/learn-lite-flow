package top.nyac.liteflow.components;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;

/**
 * @author NyaC
 * @since 2024/7/16
 */
@LiteflowComponent("a")
public class AComponent extends NodeComponent {
    @Override
    public void process() {
        System.out.println("this is AComponent");
    }
}
