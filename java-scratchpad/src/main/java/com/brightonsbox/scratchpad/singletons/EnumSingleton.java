package com.brightonsbox.scratchpad.singletons;

/**
 * Best solution for singleton, but can still create multiple instances if there are multiple Class Loaders!
 */
public enum EnumSingleton {

   INSTANCE;

   private int value;

   public int getValue() {
        return value;
   }

   public void setValue(int value) {
        this.value = value;
   }
}
