package com.example.testspringpmc.service.impl;

import org.springframework.stereotype.Service;
import com.example.testspringpmc.service.Myprog;

import java.util.List;
import java.util.stream.IntStream;

@Service
public class MyprogImpl implements Myprog {


    @Override
    public List<String> getlistchiffreaveccouleur() {
        int n = 50;
        List<String> lists=null;
        List<Integer> list = IntStream.range(1, n + 1)
                .boxed().toList();

        lists= list.stream().map(
                nebre -> divisibleby(nebre)
        ).toList();

        return lists;
    }

    @Override
    public String divisibleby(int i) {
        String result="";
        if(i%3==0)
        {
            result=i+ " " +"vert";
        }
        if(i%5==0)
        {
            result=i+ " " +"bleu";
        }

        if((i%3==0 && i%5==0))
        {
            result=i+ " " +"jaune";
        }
        return result;
    }
}
