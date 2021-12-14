package online.wubianhu.myjavanotes.studynotes.designPattern.template;

import com.alibaba.fastjson.JSON;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoTest {
    public static void main(String[] args) {
        //Exception in thread "main" org.springframework.beans.factory.xml.XmlBeanDefinitionStoreException: Line 1
        //in XML document from class path resource [applicationContext.xml] is invalid;
        //nested exception is org.xml.sax.SAXParseException; lineNumber: 1; columnNumber: 1; 文件提前结束。
        //xml文件路径问题


        //1.模拟获取SpringBean
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        ItemInfoBlock itemInfoBlock = (ItemInfoBlock) applicationContext.getBean("ItemInfoBlock");


        // 2. ModelContainer可以理解为贯穿上下文中的请求参数，或者一些组装数据需要的预加载数据
        ModelContaner modelContainer  = new ModelContaner();

        // 3. 获取返回结果
        ItemInfoBlock.ItemInfo itemInfo = itemInfoBlock.template(modelContainer);
        System.out.println(JSON.toJSONString(itemInfo));
        // 结果：{"itemId":123,"itemName":"测试"}
    }
}
