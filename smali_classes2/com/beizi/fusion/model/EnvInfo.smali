.class public Lcom/beizi/fusion/model/EnvInfo;
.super Ljava/lang/Object;
.source "EnvInfo.java"


# instance fields
.field private developerMode:Ljava/lang/String;

.field private isDebugApk:Ljava/lang/String;

.field private isDebugConnected:Ljava/lang/String;

.field private isLockScreen:Ljava/lang/String;

.field private isSimulator:Ljava/lang/String;

.field private isUsb:Ljava/lang/String;

.field private isVpn:Ljava/lang/String;

.field private isWifiProxy:Ljava/lang/String;

.field private isp:Ljava/lang/String;

.field private net:Ljava/lang/String;

.field private userAgent:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "userAgent"

    .line 2
    invoke-static {p1, v0}, Lcom/beizi/fusion/g/at;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/fusion/model/EnvInfo;->userAgent:Ljava/lang/String;

    .line 3
    invoke-static {p1}, Lcom/beizi/fusion/g/t;->b(Landroid/content/Context;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/fusion/model/EnvInfo;->net:Ljava/lang/String;

    .line 4
    invoke-static {p1}, Lcom/beizi/fusion/g/t;->a(Landroid/content/Context;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/fusion/model/EnvInfo;->isp:Ljava/lang/String;

    .line 5
    invoke-static {p1}, Lcom/beizi/fusion/g/av;->h(Landroid/content/Context;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/fusion/model/EnvInfo;->developerMode:Ljava/lang/String;

    .line 6
    invoke-static {p1}, Lcom/beizi/fusion/g/av;->g(Landroid/content/Context;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/fusion/model/EnvInfo;->isDebugApk:Ljava/lang/String;

    .line 7
    invoke-static {}, Landroid/os/Debug;->isDebuggerConnected()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/fusion/model/EnvInfo;->isDebugConnected:Ljava/lang/String;

    .line 8
    invoke-static {p1}, Lcom/beizi/fusion/g/av;->i(Landroid/content/Context;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/fusion/model/EnvInfo;->isWifiProxy:Ljava/lang/String;

    .line 9
    invoke-static {}, Lcom/beizi/fusion/g/av;->b()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/fusion/model/EnvInfo;->isVpn:Ljava/lang/String;

    .line 10
    invoke-static {}, Lcom/beizi/fusion/g/w;->a()Lcom/beizi/fusion/g/w;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/beizi/fusion/g/w;->a(Landroid/content/Context;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/beizi/fusion/model/EnvInfo;->isSimulator:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getIsp()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/EnvInfo;->isp:Ljava/lang/String;

    return-object v0
.end method

.method public getNet()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/EnvInfo;->net:Ljava/lang/String;

    return-object v0
.end method

.method public getUserAgent()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/EnvInfo;->userAgent:Ljava/lang/String;

    return-object v0
.end method

.method public isDeveloperMode()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/EnvInfo;->developerMode:Ljava/lang/String;

    return-object v0
.end method

.method public isIsDebugApk()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/EnvInfo;->isDebugApk:Ljava/lang/String;

    return-object v0
.end method

.method public isIsDebugConnected()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/EnvInfo;->isDebugConnected:Ljava/lang/String;

    return-object v0
.end method

.method public isIsLockScreen()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/EnvInfo;->isLockScreen:Ljava/lang/String;

    return-object v0
.end method

.method public isIsSimulator()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/EnvInfo;->isSimulator:Ljava/lang/String;

    return-object v0
.end method

.method public isIsUsb()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/EnvInfo;->isUsb:Ljava/lang/String;

    return-object v0
.end method

.method public isIsVpn()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/EnvInfo;->isVpn:Ljava/lang/String;

    return-object v0
.end method

.method public isIsWifiProxy()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/EnvInfo;->isWifiProxy:Ljava/lang/String;

    return-object v0
.end method

.method public setDeveloperMode(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/EnvInfo;->developerMode:Ljava/lang/String;

    return-void
.end method

.method public setIsDebugApk(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/EnvInfo;->isDebugApk:Ljava/lang/String;

    return-void
.end method

.method public setIsDebugConnected(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/EnvInfo;->isDebugConnected:Ljava/lang/String;

    return-void
.end method

.method public setIsLockScreen(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/EnvInfo;->isLockScreen:Ljava/lang/String;

    return-void
.end method

.method public setIsSimulator(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/EnvInfo;->isSimulator:Ljava/lang/String;

    return-void
.end method

.method public setIsUsb(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/EnvInfo;->isUsb:Ljava/lang/String;

    return-void
.end method

.method public setIsVpn(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/EnvInfo;->isVpn:Ljava/lang/String;

    return-void
.end method

.method public setIsWifiProxy(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/EnvInfo;->isWifiProxy:Ljava/lang/String;

    return-void
.end method

.method public setIsp(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/EnvInfo;->isp:Ljava/lang/String;

    return-void
.end method

.method public setNet(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/EnvInfo;->net:Ljava/lang/String;

    return-void
.end method

.method public setUserAgent(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/EnvInfo;->userAgent:Ljava/lang/String;

    return-void
.end method
