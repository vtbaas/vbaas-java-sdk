package io.github.vtbaas.java_sdk;

public class vGatewayFactory {

  private vGatewayFactory() {
  }

  public static vGateway createvGateway() {
    return new vGatewayImpl();
  }
}
