// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: person.proto

package com.vinsguru.models;

public interface PersonOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Person)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *name field
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   *name field
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   *age field
   * </pre>
   *
   * <code>.google.protobuf.Int32Value age = 2;</code>
   * @return Whether the age field is set.
   */
  boolean hasAge();
  /**
   * <pre>
   *age field
   * </pre>
   *
   * <code>.google.protobuf.Int32Value age = 2;</code>
   * @return The age.
   */
  com.google.protobuf.Int32Value getAge();
  /**
   * <pre>
   *age field
   * </pre>
   *
   * <code>.google.protobuf.Int32Value age = 2;</code>
   */
  com.google.protobuf.Int32ValueOrBuilder getAgeOrBuilder();

  /**
   * <code>.common.Address address = 3;</code>
   * @return Whether the address field is set.
   */
  boolean hasAddress();
  /**
   * <code>.common.Address address = 3;</code>
   * @return The address.
   */
  com.vinsguru.models.Address getAddress();
  /**
   * <code>.common.Address address = 3;</code>
   */
  com.vinsguru.models.AddressOrBuilder getAddressOrBuilder();

  /**
   * <code>repeated .common.Car car = 4;</code>
   */
  java.util.List<com.vinsguru.models.Car> 
      getCarList();
  /**
   * <code>repeated .common.Car car = 4;</code>
   */
  com.vinsguru.models.Car getCar(int index);
  /**
   * <code>repeated .common.Car car = 4;</code>
   */
  int getCarCount();
  /**
   * <code>repeated .common.Car car = 4;</code>
   */
  java.util.List<? extends com.vinsguru.models.CarOrBuilder> 
      getCarOrBuilderList();
  /**
   * <code>repeated .common.Car car = 4;</code>
   */
  com.vinsguru.models.CarOrBuilder getCarOrBuilder(
      int index);
}