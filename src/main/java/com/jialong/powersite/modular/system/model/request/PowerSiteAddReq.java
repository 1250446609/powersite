package com.jialong.powersite.modular.system.model.request;

public class PowerSiteAddReq {

    private Integer rid;

    private String siteName;

    private String siteShortname;

    private String siteAddr;

    private Integer siteStatus;

    private String siteHost;

    private String sitePorts;

    private  String publicIp;

    private  Integer websocketPort;

    private  Integer statusPort;

    private  String username;

    private  String password;

    private  Integer httpPort;

    private  Integer httpsPort;

    private  Integer tcpPort;

    private  Integer udpPort;

    private  Integer rtspPort;

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getSiteShortname() {
        return siteShortname;
    }

    public void setSiteShortname(String siteShortname) {
        this.siteShortname = siteShortname;
    }

    public String getSiteAddr() {
        return siteAddr;
    }

    public void setSiteAddr(String siteAddr) {
        this.siteAddr = siteAddr;
    }

    public Integer getSiteStatus() {
        return siteStatus;
    }

    public void setSiteStatus(Integer siteStatus) {
        this.siteStatus = siteStatus;
    }

    public String getSiteHost() {
        return siteHost;
    }

    public void setSiteHost(String siteHost) {
        this.siteHost = siteHost;
    }

    public String getSitePorts() {
        return sitePorts;
    }

    public void setSitePorts(String sitePorts) {
        this.sitePorts = sitePorts;
    }

    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    public Integer getWebsocketPort() {
        return websocketPort;
    }

    public void setWebsocketPort(Integer websocketPort) {
        this.websocketPort = websocketPort;
    }

    public Integer getStatusPort() {
        return statusPort;
    }

    public void setStatusPort(Integer statusPort) {
        this.statusPort = statusPort;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getHttpPort() {
        return httpPort;
    }

    public void setHttpPort(Integer httpPort) {
        this.httpPort = httpPort;
    }

    public Integer getHttpsPort() {
        return httpsPort;
    }

    public void setHttpsPort(Integer httpsPort) {
        this.httpsPort = httpsPort;
    }

    public Integer getTcpPort() {
        return tcpPort;
    }

    public void setTcpPort(Integer tcpPort) {
        this.tcpPort = tcpPort;
    }

    public Integer getUdpPort() {
        return udpPort;
    }

    public void setUdpPort(Integer udpPort) {
        this.udpPort = udpPort;
    }

    public Integer getRtspPort() {
        return rtspPort;
    }

    public void setRtspPort(Integer rtspPort) {
        this.rtspPort = rtspPort;
    }
}
