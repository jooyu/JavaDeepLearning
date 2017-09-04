package com.yujoo.jdk.guava;

import java.util.Set;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableSet;

public class guava20170904 {


public static void main(String[] args) {
	
	Optional<Integer> possible = Optional.of(5);

	System.out.println(possible.isPresent()); // returns true

	System.out.println(possible.get()); // returns 5

	


}
}
