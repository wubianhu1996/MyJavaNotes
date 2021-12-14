package online.wubianhu.myjavanotes.studynotes.designPattern.template;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
public class ItemInfoBlock extends Template<ItemInfoBlock.ItemInfo> {


    @Override
    protected ItemInfo initBlock() {
        return new ItemInfoBlock.ItemInfo();
    }


    //模拟业务逻辑，组装返回商品信息模版数据
    @Override
    protected void dowork(ModelContaner modelContaner, ItemInfo block) {
        block.setItemName("商品名称");
        block.setItemId("商品编号");
    }

    @Data
    protected static class ItemInfo{
        private String ItemName;
        private String ItemId;
    }
}
