// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rest.proto

package com.proto.rest;

public interface BasketOrBuilder extends
    // @@protoc_insertion_point(interface_extends:product.Basket)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 id = 1;</code>
   * @return The id.
   */
  int getId();

  /**
   * <code>repeated .product.Product product = 2;</code>
   */
  java.util.List<com.proto.rest.Product> 
      getProductList();
  /**
   * <code>repeated .product.Product product = 2;</code>
   */
  com.proto.rest.Product getProduct(int index);
  /**
   * <code>repeated .product.Product product = 2;</code>
   */
  int getProductCount();
  /**
   * <code>repeated .product.Product product = 2;</code>
   */
  java.util.List<? extends com.proto.rest.ProductOrBuilder> 
      getProductOrBuilderList();
  /**
   * <code>repeated .product.Product product = 2;</code>
   */
  com.proto.rest.ProductOrBuilder getProductOrBuilder(
      int index);

  /**
   * <code>float total = 3;</code>
   * @return The total.
   */
  float getTotal();
}
