  public static RSAPublicKey getPublicKeyFromFile(String filePath) throws IOException, CertificateException {
    String pemString = FileUtils.readFileToString(new File(filePath));
    return getPublicKeyFromString(pemString);
  }