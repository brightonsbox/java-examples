package com.brightonsbox.scratchpad.lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class DifferentListImplementations {

    private static int INIT_CAPACITY = 10;
    private static int CAPACITY_INCREMENT = 10;

    /**
     * Fast. Constant-time positional access.
     * Not synchronized.
     * Additions to the list causing overflow result resizing by 50% (not configurable like Vector).
     */
    List<String> arrayList = new ArrayList<>(INIT_CAPACITY);

    /**
     * Good if frequent operation is to add elements to beginning of list, or iterate over it to delete elements,
     * these are constant-time operations (linear in an ArrayList).
     *
     * Positional access penalty (linear).
     *
     * Other methods available clone, addFirst, getFirst, removeFirst, addLast, getLast, removeLast
     */
    List<String> linkedList = new LinkedList<>();

    /**
     * Like ArrayList, but synchronized, so slower.
     * Can configure the capacity increment on overflow.
     */
    List<String> vector = new Vector<>(INIT_CAPACITY, CAPACITY_INCREMENT);

}
