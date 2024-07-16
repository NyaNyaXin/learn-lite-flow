package top.nyac.liteflow.components.parallel;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;

/**
 * @author NyaC
 * @since 2024/7/16
 */
@LiteflowComponent("c")
public class CComponent extends NodeComponent {
    @Override
    public void process() throws Exception {
        System.out.println("this is CComponent");
    }
}
