package com.cpt.enc.test;

import com.cpt.enc.reflect.Desensitized;
import com.cpt.enc.reflect.Mode;
import lombok.Data;

import java.util.List;

/**
 * @author lw
 * @since 2021/2/5
 **/
@Data
public class Goods {
    @Desensitized(mode = Mode.PHONE)
    private String phone="15610011001";

    private List<Detail> goodsDetail;
}
