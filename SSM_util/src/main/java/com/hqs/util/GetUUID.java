package com.hqs.util;

import java.util.UUID;

public class GetUUID {
    public static String get(){
        return UUID.randomUUID ().toString ().replace ("-","");
    }
}
