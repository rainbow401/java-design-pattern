package com.Adaptor.example1;

import com.Adaptor.example1.sdk.CD;

/**
 * 使用适配器模式 封装外部缺陷接口/方法
 * @Description:
 * @Author: yanzhihao
 * @Date: 2022/2/7 5:32 下午
 */
public class CDAdaptor extends CD implements ITarget {

    @Override
    public void function1() {
        super.staticFunction1();
    }

    @Override
    public void function2() {
        super.uglyNamingFunction2();
    }

    @Override
    public void function3(ParamsWrapperDefinition paramWrapper) {
        super.tooManyParamsFunction3(paramWrapper.getParamA, paramWrapper.getParamB, paramWrapper.getParamC);
    }

    @Override
    public void function4() {
        super.lowPerformanceFunction4();
    }
}
