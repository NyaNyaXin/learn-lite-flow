package top.nyac.liteflow;

import com.yomahub.liteflow.core.FlowExecutor;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LiteflowApplicationTests {

    @Resource
    private FlowExecutor flowExecutor;

    @Test
    void testSerial() {
//        flowExecutor.execute2Resp("serial_1", "arg");
        flowExecutor.execute2Resp("serial_2", "arg");
//        flowExecutor.execute2Resp("serial_3", "arg");
    }

}
