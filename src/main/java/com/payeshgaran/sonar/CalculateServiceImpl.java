package com.payeshgaran.sonar;

import org.springframework.stereotype.Component;

@Component
public class CalculateServiceImpl implements CalculateService {

    @Override
    public int calc(boolean shallCalc) {
        if (shallCalc) {
            return 1;
        }
        return 0;
    }

}
