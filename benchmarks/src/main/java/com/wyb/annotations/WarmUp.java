package com.wyb.annotations;


public @interface WarmUp {
    int iterations() default 0;

}
