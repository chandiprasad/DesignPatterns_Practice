package servlet;

import java.security.Permission;

class MySecurityManager extends SecurityManager {
    @Override
    public void checkPermission(Permission perm) {
        return;
    }
}