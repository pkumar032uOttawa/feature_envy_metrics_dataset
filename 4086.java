    public static boolean isWindows(String osName) {
        return (getOperatingSystem(osName) & OS_WINDOWS_MASK) != 0;
    }