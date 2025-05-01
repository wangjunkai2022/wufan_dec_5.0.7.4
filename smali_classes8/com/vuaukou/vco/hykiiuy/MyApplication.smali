.class public Lcom/vuaukou/vco/hykiiuy/MyApplication;
.super Landroid/app/Application;


# static fields
.field public static TAG:Ljava/lang/String; = null

.field public static final VER:Ljava/lang/String; = "7.5.6_706"

.field private static a:Ljava/lang/String;

.field private static b:Ljava/lang/String;

.field private static c:Ljava/lang/String;

.field private static d:Landroid/content/Context;

.field private static e:Z

.field private static f:I

.field public static mLoadShell:Z

.field public static mNeedBugrpt:Z

.field public static mOfficial:Z

.field private static newApp:Landroid/app/Application;

.field private static runApp:Landroid/app/Application;

.field public static strAppName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v2, 0x0

    const/4 v1, 0x0

    const-string v0, "ORcVFREWFw=="

    invoke-static/range {v0 .. v0}, La/auu/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/vuaukou/vco/hykiiuy/MyApplication;->TAG:Ljava/lang/String;

    const-string v0, "LQoZSxcGBDsOGxBPBQYhSxwcChoMOxxaKBgyFT4JHQYABwwhCw=="

    invoke-static/range {v0 .. v0}, La/auu/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/vuaukou/vco/hykiiuy/MyApplication;->strAppName:Ljava/lang/String;

    const-string v0, "Kx0AFwAQEREWAwwVEA0RVQ=="

    invoke-static/range {v0 .. v0}, La/auu/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/vuaukou/vco/hykiiuy/MyApplication;->a:Ljava/lang/String;

    const-string v0, "PhcbEwgXADw6BxIIBwYmOkU="

    invoke-static/range {v0 .. v0}, La/auu/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/vuaukou/vco/hykiiuy/MyApplication;->b:Ljava/lang/String;

    const-string v0, "PQ0RCQ0sCScIHRE+Qg=="

    invoke-static/range {v0 .. v0}, La/auu/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/vuaukou/vco/hykiiuy/MyApplication;->c:Ljava/lang/String;

    sput-object v2, Lcom/vuaukou/vco/hykiiuy/MyApplication;->d:Landroid/content/Context;

    sput-object v2, Lcom/vuaukou/vco/hykiiuy/MyApplication;->runApp:Landroid/app/Application;

    sput-object v2, Lcom/vuaukou/vco/hykiiuy/MyApplication;->newApp:Landroid/app/Application;

    const/4 v0, 0x1

    sput-boolean v0, Lcom/vuaukou/vco/hykiiuy/MyApplication;->mOfficial:Z

    sput-boolean v1, Lcom/vuaukou/vco/hykiiuy/MyApplication;->mNeedBugrpt:Z

    sput-boolean v1, Lcom/vuaukou/vco/hykiiuy/MyApplication;->mLoadShell:Z

    sput-boolean v1, Lcom/vuaukou/vco/hykiiuy/MyApplication;->e:Z

    sput v1, Lcom/vuaukou/vco/hykiiuy/MyApplication;->f:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/app/Application;-><init>()V

    return-void
.end method

.method private static a(Landroid/content/Context;)Landroid/app/Application;
    .locals 2

    :try_start_0
    sget-object v0, Lcom/vuaukou/vco/hykiiuy/MyApplication;->newApp:Landroid/app/Application;

    if-nez v0, :cond_0

    sget-object v0, Lcom/vuaukou/vco/hykiiuy/MyApplication;->strAppName:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    sget-object v0, Lcom/vuaukou/vco/hykiiuy/MyApplication;->newApp:Landroid/app/Application;

    :goto_0
    return-object v0

    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    if-nez v0, :cond_2

    sget-object v0, Lcom/vuaukou/vco/hykiiuy/MyApplication;->newApp:Landroid/app/Application;

    goto :goto_0

    :cond_2
    sget-object v1, Lcom/vuaukou/vco/hykiiuy/MyApplication;->strAppName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Application;

    sput-object v0, Lcom/vuaukou/vco/hykiiuy/MyApplication;->newApp:Landroid/app/Application;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_3
    sget-object v0, Lcom/vuaukou/vco/hykiiuy/MyApplication;->newApp:Landroid/app/Application;

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    sget-object v0, Lcom/vuaukou/vco/hykiiuy/MyApplication;->newApp:Landroid/app/Application;

    goto :goto_0
.end method

.method private static a()Z
    .locals 3

    sget-object v0, Lcom/vuaukou/vco/hykiiuy/MyApplication;->c:Ljava/lang/String;

    const-string v1, "fw=="

    invoke-static/range {v1 .. v1}, La/auu/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "FQsRAAUwCiARBgoNIA0rCRgpAAYLLQ0pRQMgDSsJGCkABgstDTgMDBoRKwFO"

    invoke-static/range {v2 .. v2}, La/auu/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "bggnDQQfCQ0LAF8="

    invoke-static/range {v2 .. v2}, La/auu/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget v2, Lcom/vuaukou/vco/hykiiuy/MyApplication;->f:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    sget v1, Lcom/vuaukou/vco/hykiiuy/MyApplication;->f:I

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static native g()Z
.end method

.method public static getAppCtx()Landroid/content/Context;
    .locals 1

    sget-object v0, Lcom/vuaukou/vco/hykiiuy/MyApplication;->d:Landroid/content/Context;

    return-object v0
.end method

.method public static getVersion()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/vuaukou/vco/hykiiuy/MyApplication;->TAG:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "eUtBS1csUn5T"

    invoke-static/range {v1 .. v1}, La/auu/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static native l(Landroid/app/Application;)Z
.end method

.method public static loadLib(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/vuaukou/vco/hykiiuy/o;->a(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public static native n0110()V
.end method

.method public static native n01101(C)V
.end method

.method public static native n011011(CC)V
.end method

.method public static native n0110111(CCC)V
.end method

.method public static native n01101111(CCCC)V
.end method

.method public static native n0110111112(CCCCCD)V
.end method

.method public static native n01101112(CCCD)V
.end method

.method public static native n0110113(CCLjava/lang/Object;)V
.end method

.method public static native n011011311(CCLjava/lang/Object;CC)V
.end method

.method public static native n011011313(CCLjava/lang/Object;CLjava/lang/Object;)V
.end method

.method public static native n0110113311(CCLjava/lang/Object;Ljava/lang/Object;CC)V
.end method

.method public static native n01101133113(CCLjava/lang/Object;Ljava/lang/Object;CCLjava/lang/Object;)V
.end method

.method public static native n011012(CD)V
.end method

.method public static native n011013(CLjava/lang/Object;)V
.end method

.method public static native n0110133(CLjava/lang/Object;Ljava/lang/Object;)V
.end method

.method public static native n01101333(CLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
.end method

.method public static native n01102(D)V
.end method

.method public static native n011021111(DCCCC)V
.end method

.method public static native n0110221(DDC)V
.end method

.method public static native n01102311(DLjava/lang/Object;CC)V
.end method

.method public static native n01103(Ljava/lang/Object;)V
.end method

.method public static native n011031(Ljava/lang/Object;C)V
.end method

.method public static native n0110311(Ljava/lang/Object;CC)V
.end method

.method public static native n01103111(Ljava/lang/Object;CCC)V
.end method

.method public static native n011031111(Ljava/lang/Object;CCCC)V
.end method

.method public static native n0110311111(Ljava/lang/Object;CCCCC)V
.end method

.method public static native n01103131(Ljava/lang/Object;CLjava/lang/Object;C)V
.end method

.method public static native n011031311(Ljava/lang/Object;CLjava/lang/Object;CC)V
.end method

.method public static native n011031333333313(Ljava/lang/Object;CLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;CLjava/lang/Object;)V
.end method

.method public static native n011032(Ljava/lang/Object;D)V
.end method

.method public static native n011033(Ljava/lang/Object;Ljava/lang/Object;)V
.end method

.method public static native n011033111(Ljava/lang/Object;Ljava/lang/Object;CCC)V
.end method

.method public static native n0110333(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
.end method

.method public static native n01103332(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;D)V
.end method

.method public static native n0111()C
.end method

.method public static native n01111(C)C
.end method

.method public static native n011111(CC)C
.end method

.method public static native n0111111(CCC)C
.end method

.method public static native n01111111(CCCC)C
.end method

.method public static native n011111211311(CCDCCLjava/lang/Object;CC)C
.end method

.method public static native n01111121311(CCDCLjava/lang/Object;CC)C
.end method

.method public static native n011111311(CCLjava/lang/Object;CC)C
.end method

.method public static native n011111311311(CCLjava/lang/Object;CCLjava/lang/Object;CC)C
.end method

.method public static native n0111121(CDC)C
.end method

.method public static native n01111211(CDCC)C
.end method

.method public static native n0111121111(CDCCCC)C
.end method

.method public static native n01111212111(CDCDCCC)C
.end method

.method public static native n011112122(CDCDD)C
.end method

.method public static native n011113(CLjava/lang/Object;)C
.end method

.method public static native n01111311(CLjava/lang/Object;CC)C
.end method

.method public static native n0111133(CLjava/lang/Object;Ljava/lang/Object;)C
.end method

.method public static native n01111333(CLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)C
.end method

.method public static native n01112(D)C
.end method

.method public static native n011121(DC)C
.end method

.method public static native n011123(DLjava/lang/Object;)C
.end method

.method public static native n01113(Ljava/lang/Object;)C
.end method

.method public static native n011131(Ljava/lang/Object;C)C
.end method

.method public static native n0111311(Ljava/lang/Object;CC)C
.end method

.method public static native n01113121(Ljava/lang/Object;CDC)C
.end method

.method public static native n011133(Ljava/lang/Object;Ljava/lang/Object;)C
.end method

.method public static native n0111331(Ljava/lang/Object;Ljava/lang/Object;C)C
.end method

.method public static native n0111331111(Ljava/lang/Object;Ljava/lang/Object;CCCC)C
.end method

.method public static native n01113311111(Ljava/lang/Object;Ljava/lang/Object;CCCCC)C
.end method

.method public static native n0111332(Ljava/lang/Object;Ljava/lang/Object;D)C
.end method

.method public static native n01113331(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;C)C
.end method

.method public static native n0112()D
.end method

.method public static native n01121(C)D
.end method

.method public static native n0112121(CDC)D
.end method

.method public static native n01121233(CDLjava/lang/Object;Ljava/lang/Object;)D
.end method

.method public static native n011213112(CLjava/lang/Object;CCD)D
.end method

.method public static native n011213222(CLjava/lang/Object;DDD)D
.end method

.method public static native n01122(D)D
.end method

.method public static native n01122131(DCLjava/lang/Object;C)D
.end method

.method public static native n0112232(DLjava/lang/Object;D)D
.end method

.method public static native n0112233(DLjava/lang/Object;Ljava/lang/Object;)D
.end method

.method public static native n01123(Ljava/lang/Object;)D
.end method

.method public static native n01123331(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;C)D
.end method

.method public static native n0113()Ljava/lang/Object;
.end method

.method public static native n01131(C)Ljava/lang/Object;
.end method

.method public static native n011311(CC)Ljava/lang/Object;
.end method

.method public static native n0113111(CCC)Ljava/lang/Object;
.end method

.method public static native n01131211(CDCC)Ljava/lang/Object;
.end method

.method public static native n0113123(CDLjava/lang/Object;)Ljava/lang/Object;
.end method

.method public static native n011313(CLjava/lang/Object;)Ljava/lang/Object;
.end method

.method public static native n01131311(CLjava/lang/Object;CC)Ljava/lang/Object;
.end method

.method public static native n01131333(CLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public static native n011321(DC)Ljava/lang/Object;
.end method

.method public static native n011322(DD)Ljava/lang/Object;
.end method

.method public static native n01133(Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public static native n0113311(Ljava/lang/Object;CC)Ljava/lang/Object;
.end method

.method public static native n0113311131(Ljava/lang/Object;CCCLjava/lang/Object;C)Ljava/lang/Object;
.end method

.method public static native n011332(Ljava/lang/Object;D)Ljava/lang/Object;
.end method

.method public static native n01133211(Ljava/lang/Object;DCC)Ljava/lang/Object;
.end method

.method public static native n0113323(Ljava/lang/Object;DLjava/lang/Object;)Ljava/lang/Object;
.end method

.method public static native n011333(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public static native n0113331(Ljava/lang/Object;Ljava/lang/Object;C)Ljava/lang/Object;
.end method

.method public static native n0113333(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public static native n011333332113(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;DCCLjava/lang/Object;)Ljava/lang/Object;
.end method

.method public static needExtractSo(Landroid/content/Context;)Z
    .locals 3

    sget-object v0, Lcom/vuaukou/vco/hykiiuy/MyApplication;->a:Ljava/lang/String;

    const-string v1, "fw=="

    invoke-static/range {v1 .. v1}, La/auu/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "FQsRAAU2HToXFQYVIAoTRRYrBBYBCx0ABAIHXw=="

    invoke-static/range {v2 .. v2}, La/auu/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return v0
.end method


# virtual methods
.method protected attachBaseContext(Landroid/content/Context;)V
    .locals 10

    const/4 v4, 0x1

    invoke-super {p0, p1}, Landroid/app/Application;->attachBaseContext(Landroid/content/Context;)V

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const-string v0, "PREBBw=="

    invoke-static/range {v0 .. v0}, La/auu/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v3, 0xa

    if-lt v2, v3, :cond_0

    new-instance v2, Landroid/content/pm/Signature;

    invoke-direct {v2, v0}, Landroid/content/pm/Signature;-><init>(Ljava/lang/String;)V

    invoke-static {v2, v1}, Lcom/vuaukou/vco/hykiiuy/plugin/b;->a(Landroid/content/pm/Signature;Ljava/lang/String;)V

    :cond_0
    sput-object p1, Lcom/vuaukou/vco/hykiiuy/MyApplication;->d:Landroid/content/Context;

    sget-object v0, Lcom/vuaukou/vco/hykiiuy/MyApplication;->b:Ljava/lang/String;

    const-string v2, "fw=="

    invoke-static/range {v2 .. v2}, La/auu/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    sput-boolean v0, Lcom/vuaukou/vco/hykiiuy/MyApplication;->e:Z

    sget v0, Lcom/vuaukou/vco/hykiiuy/MyApplication;->f:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Lcom/vuaukou/vco/hykiiuy/MyApplication;->f:I

    invoke-static {}, Lcom/vuaukou/vco/hykiiuy/MyApplication;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_0
    return-void

    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "FQQAEQAQDQwEBwAiHAs6AAwRPFMHKwIdC01TEysXBwwOHV8="

    invoke-static/range {v3 .. v3}, La/auu/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/vuaukou/vco/hykiiuy/MyApplication;->getVersion()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, "bggkFw4FDCoABjYWGhEtDU4="

    invoke-static/range {v3 .. v3}, La/auu/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-boolean v3, Lcom/vuaukou/vco/hykiiuy/MyApplication;->e:Z

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    sget-object v0, Lcom/vuaukou/vco/hykiiuy/MyApplication;->newApp:Landroid/app/Application;

    if-nez v0, :cond_7

    sget-boolean v0, Lcom/vuaukou/vco/hykiiuy/MyApplication;->mLoadShell:Z

    if-nez v0, :cond_2

    invoke-static {p1}, Lcom/vuaukou/vco/hykiiuy/MyApplication;->needExtractSo(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p1}, Lcom/vuaukou/vco/hykiiuy/plugin/f;->a(Landroid/content/Context;)V

    :cond_2
    invoke-static {p1}, Lcom/vuaukou/vco/hykiiuy/MyJni;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    sput-boolean v4, Lcom/vuaukou/vco/hykiiuy/MyApplication;->mNeedBugrpt:Z

    invoke-static {}, Lcom/vuaukou/vco/hykiiuy/MyApplication;->getVersion()Ljava/lang/String;

    move-result-object v0

    sget-boolean v3, Lcom/vuaukou/vco/hykiiuy/a;->b:Z

    :try_start_0
    const-string v4, "LQoZSxcGBDsOGxBPBQYhSxwcChoMOxxaEBIWF2AwBwATIBE8BAAABgo="

    invoke-static/range {v4 .. v4}, La/auu/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Class;

    const/4 v6, 0x0

    const-class v7, Landroid/content/Context;

    aput-object v7, v5, v6

    invoke-virtual {v4, v5}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v5

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    aput-object p1, v6, v7

    invoke-virtual {v5, v6}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    const-string v6, "PQAAMBIWFxoEEw=="

    invoke-static/range {v6 .. v6}, La/auu/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/Class;

    const/4 v8, 0x0

    const-class v9, Ljava/lang/String;

    aput-object v9, v7, v8

    invoke-virtual {v4, v6, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/Object;

    const/4 v8, 0x0

    aput-object v0, v7, v8

    invoke-virtual {v6, v5, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v3, :cond_3

    const-string v0, "PQAAIwgfESsXIwoTFxY="

    invoke-static/range {v0 .. v0}, La/auu/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Class;

    const/4 v6, 0x0

    const-class v7, [Ljava/lang/String;

    aput-object v7, v3, v6

    invoke-virtual {v4, v0, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    if-eqz v0, :cond_3

    const/4 v3, 0x5

    new-array v3, v3, [Ljava/lang/String;

    const/4 v4, 0x0

    const-string v6, "LQoZSxcGBDsOGxBPBQYhSxwcChoMOxw="

    invoke-static/range {v6 .. v6}, La/auu/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v3, v4

    const/4 v4, 0x1

    const-string v6, "IgwWExQcECM="

    invoke-static/range {v6 .. v6}, La/auu/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v3, v4

    const/4 v4, 0x2

    const-string v6, "IgwWCwQUEC8XEEsSHA=="

    invoke-static/range {v6 .. v6}, La/auu/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v3, v4

    const/4 v4, 0x3

    const-string v6, "IgwWAQQLAycdWhYO"

    invoke-static/range {v6 .. v6}, La/auu/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v3, v4

    const/4 v4, 0x4

    const-string v6, "JgwaEVs="

    invoke-static/range {v6 .. v6}, La/auu/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v3, v4

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v3, v4, v6

    invoke-virtual {v0, v5, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    const-string v0, "LQoZSxcGBDsOGxBPBQYhSxwcChoMOxxaJhMSFiYtFQsFHwA8"

    invoke-static/range {v0 .. v0}, La/auu/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v3, "JwsdEQ=="

    invoke-static/range {v3 .. v3}, La/auu/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Class;

    const/4 v6, 0x0

    const-class v7, Landroid/content/Context;

    aput-object v7, v4, v6

    const/4 v6, 0x1

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    aput-object v7, v4, v6

    invoke-virtual {v0, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object p1, v4, v6

    const/4 v6, 0x1

    aput-object v5, v4, v6

    invoke-virtual {v3, v0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_4
    :goto_1
    sget-boolean v0, Lcom/vuaukou/vco/hykiiuy/MyApplication;->mLoadShell:Z

    if-nez v0, :cond_6

    const-string v0, "OBAbEAw="

    invoke-static/range {v0 .. v0}, La/auu/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/vuaukou/vco/hykiiuy/MyJni;->a()Z

    move-result v3

    if-eqz v3, :cond_5

    const-string v0, "OBAbEAxeHXZT"

    invoke-static/range {v0 .. v0}, La/auu/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_5
    :try_start_1
    invoke-static {p1, v0}, Lcom/vuaukou/vco/hykiiuy/o;->a(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :cond_6
    :goto_2
    invoke-static {p0, v1}, Lcom/vuaukou/vco/hykiiuy/MyJni;->load(Landroid/app/Application;Ljava/lang/String;)Z

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "FQkbBAUuRToMGQBb"

    invoke-static/range {v1 .. v1}, La/auu/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    sub-long/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lcom/vuaukou/vco/hykiiuy/MyApplication;->a(Landroid/content/Context;)Landroid/app/Application;

    move-result-object v0

    sput-object v0, Lcom/vuaukou/vco/hykiiuy/MyApplication;->newApp:Landroid/app/Application;

    sget-object v0, Lcom/vuaukou/vco/hykiiuy/MyApplication;->newApp:Landroid/app/Application;

    invoke-static {p1, v0}, Lcom/vuaukou/vco/hykiiuy/MyJni;->ra(Landroid/content/Context;Landroid/app/Application;)Z

    :cond_7
    const-string v0, "IAoANRMcBy8RHQoP"

    invoke-static/range {v0 .. v0}, La/auu/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/vuaukou/vco/hykiiuy/NEDialog;->showProbation(Ljava/lang/String;)V

    sget-object v0, Lcom/vuaukou/vco/hykiiuy/MyApplication;->runApp:Landroid/app/Application;

    if-nez v0, :cond_8

    sput-object p0, Lcom/vuaukou/vco/hykiiuy/MyApplication;->runApp:Landroid/app/Application;

    :cond_8
    sget-boolean v0, Lcom/vuaukou/vco/hykiiuy/MyApplication;->e:Z

    if-nez v0, :cond_9

    invoke-static {}, Lcom/vuaukou/vco/hykiiuy/MyJni;->cp()V

    :cond_9
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "FQQAEQAQDQwEBwAiHAs6AAwRPFMAIAFYRRUaCCtf"

    invoke-static/range {v1 .. v1}, La/auu/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    sub-long v2, v4, v2

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    goto :goto_1

    :catch_1
    move-exception v3

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "FQQAEQAQDQwEBwAiHAs6AAwRPFMJIQQQFg5TADYGERUVGgogSQ=="

    invoke-static/range {v5 .. v5}, La/auu/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    goto :goto_2
.end method

.method public createPackageContext(Ljava/lang/String;I)Landroid/content/Context;
    .locals 2

    sget-object v0, Lcom/vuaukou/vco/hykiiuy/MyApplication;->strAppName:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-boolean v0, Lcom/vuaukou/vco/hykiiuy/MyApplication;->e:Z

    if-nez v0, :cond_1

    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/Application;->createPackageContext(Ljava/lang/String;I)Landroid/content/Context;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "FQYGAAAHAB4EFw4AFAANChoRBAsRE0UEBAIYBCkAOgQMFl8="

    invoke-static/range {v1 .. v1}, La/auu/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "bgMYBAYAXw=="

    invoke-static/range {v1 .. v1}, La/auu/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    sget-object v0, Lcom/vuaukou/vco/hykiiuy/MyApplication;->runApp:Landroid/app/Application;

    invoke-virtual {v0}, Landroid/app/Application;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lcom/vuaukou/vco/hykiiuy/MyApplication;->newApp:Landroid/app/Application;

    invoke-static {v0, v1}, Lcom/vuaukou/vco/hykiiuy/MyJni;->rp(Landroid/content/Context;Landroid/app/Application;)Z

    sget-object v0, Lcom/vuaukou/vco/hykiiuy/MyApplication;->newApp:Landroid/app/Application;

    invoke-virtual {v0}, Landroid/app/Application;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lcom/vuaukou/vco/hykiiuy/MyApplication;->newApp:Landroid/app/Application;

    goto :goto_0

    :cond_2
    invoke-super {p0, p1, p2}, Landroid/app/Application;->createPackageContext(Ljava/lang/String;I)Landroid/content/Context;

    move-result-object v0

    goto :goto_0
.end method

.method public getPackageName()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/vuaukou/vco/hykiiuy/MyApplication;->strAppName:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-boolean v0, Lcom/vuaukou/vco/hykiiuy/MyApplication;->e:Z

    if-nez v0, :cond_1

    :cond_0
    invoke-super {p0}, Landroid/app/Application;->getPackageName()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_1
    const-string v0, ""

    goto :goto_0
.end method

.method public native n1110()V
.end method

.method public native n11101(C)V
.end method

.method public native n111011(CC)V
.end method

.method public native n1110113(CCLjava/lang/Object;)V
.end method

.method public native n111012(CD)V
.end method

.method public native n111013(CLjava/lang/Object;)V
.end method

.method public native n1110132(CLjava/lang/Object;D)V
.end method

.method public native n1110133(CLjava/lang/Object;Ljava/lang/Object;)V
.end method

.method public native n11102(D)V
.end method

.method public native n111021(DC)V
.end method

.method public native n11103(Ljava/lang/Object;)V
.end method

.method public native n1110313(Ljava/lang/Object;CLjava/lang/Object;)V
.end method

.method public native n111032(Ljava/lang/Object;D)V
.end method

.method public native n1110321(Ljava/lang/Object;DC)V
.end method

.method public native n1110322(Ljava/lang/Object;DD)V
.end method

.method public native n111032211(Ljava/lang/Object;DDCC)V
.end method

.method public native n1110323(Ljava/lang/Object;DLjava/lang/Object;)V
.end method

.method public native n111033(Ljava/lang/Object;Ljava/lang/Object;)V
.end method

.method public native n1110333(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
.end method

.method public native n1111()C
.end method

.method public native n111111(CC)C
.end method

.method public native n11112(D)C
.end method

.method public native n11113(Ljava/lang/Object;)C
.end method

.method public native n111132(Ljava/lang/Object;D)C
.end method

.method public native n111133(Ljava/lang/Object;Ljava/lang/Object;)C
.end method

.method public native n1111333(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)C
.end method

.method public native n1112()D
.end method

.method public native n111212(CD)D
.end method

.method public native n11122(D)D
.end method

.method public native n111232(Ljava/lang/Object;D)D
.end method

.method public native n1113()Ljava/lang/Object;
.end method

.method public native n11131(C)Ljava/lang/Object;
.end method

.method public native n111311(CC)Ljava/lang/Object;
.end method

.method public native n111311113(CCCCLjava/lang/Object;)Ljava/lang/Object;
.end method

.method public native n11131113(CCCLjava/lang/Object;)Ljava/lang/Object;
.end method

.method public native n111313(CLjava/lang/Object;)Ljava/lang/Object;
.end method

.method public native n11133(Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public native n1113311(Ljava/lang/Object;CC)Ljava/lang/Object;
.end method

.method public native n111332(Ljava/lang/Object;D)Ljava/lang/Object;
.end method

.method public native n111333(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public native n1113333(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public onCreate()V
    .locals 6

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-super {p0}, Landroid/app/Application;->onCreate()V

    invoke-static {}, Lcom/vuaukou/vco/hykiiuy/MyApplication;->a()Z

    move-result v2

    if-eqz v2, :cond_0

    :goto_0
    return-void

    :cond_0
    sget-object v2, Lcom/vuaukou/vco/hykiiuy/MyApplication;->runApp:Landroid/app/Application;

    if-eqz v2, :cond_1

    sget-object v2, Lcom/vuaukou/vco/hykiiuy/MyApplication;->runApp:Landroid/app/Application;

    invoke-virtual {v2}, Landroid/app/Application;->getBaseContext()Landroid/content/Context;

    move-result-object v2

    sget-object v3, Lcom/vuaukou/vco/hykiiuy/MyApplication;->newApp:Landroid/app/Application;

    invoke-static {v2, v3}, Lcom/vuaukou/vco/hykiiuy/MyJni;->run(Landroid/content/Context;Landroid/app/Application;)Z

    :cond_1
    sget-object v2, Lcom/vuaukou/vco/hykiiuy/MyApplication;->newApp:Landroid/app/Application;

    if-eqz v2, :cond_2

    sget-object v2, Lcom/vuaukou/vco/hykiiuy/MyApplication;->newApp:Landroid/app/Application;

    invoke-static {v2}, Lcom/vuaukou/vco/hykiiuy/MyJni;->ip(Landroid/app/Application;)V

    sget-object v2, Lcom/vuaukou/vco/hykiiuy/MyApplication;->newApp:Landroid/app/Application;

    invoke-virtual {v2}, Landroid/app/Application;->onCreate()V

    :goto_1
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "FRcBCzxTEScIEV8="

    invoke-static/range {v3 .. v3}, La/auu/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long/2addr v4, v0

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/vuaukou/vco/hykiiuy/MyApplication;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    sput-object v2, Lcom/vuaukou/vco/hykiiuy/MyApplication;->d:Landroid/content/Context;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "FQoaJhMWBDoAKUUEHQFiRQAMDBZf"

    invoke-static/range {v3 .. v3}, La/auu/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long v0, v4, v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_2
    sget-object v2, Lcom/vuaukou/vco/hykiiuy/MyApplication;->runApp:Landroid/app/Application;

    invoke-static {v2}, Lcom/vuaukou/vco/hykiiuy/MyJni;->ip(Landroid/app/Application;)V

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "FRcBCzxTKDckBBUNGgYvER0KD10LKxI1FRFTDD1FGhANH0k8EBokEQNFJxZU"

    invoke-static/range {v3 .. v3}, La/auu/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v3, Lcom/vuaukou/vco/hykiiuy/MyApplication;->runApp:Landroid/app/Application;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_1
.end method
