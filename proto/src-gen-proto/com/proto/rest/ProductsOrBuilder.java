// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rest.proto

package com.proto.rest;

public interface ProductsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:product.Products)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .product.Product product = 1;</code>
   */
  java.util.List<com.proto.rest.Product> 
      getProductList();
  /**
   * <code>repeated .product.Product product = 1;</code>
   */
  com.proto.rest.Product getProduct(int index);
  /**
   * <code>repeated .product.Product product = 1;</code>
   */
  int getProductCount();
  /**
   * <code>repeated .product.Product product = 1;</code>
   */
  java.util.List<? extends com.proto.rest.ProductOrBuilder> 
      getProductOrBuilderList();
  /**
   * <code>repeated .product.Product product = 1;</code>
   */
  com.proto.rest.ProductOrBuilder getProductOrBuilder(
      int index);
}
