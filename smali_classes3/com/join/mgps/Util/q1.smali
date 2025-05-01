.class public Lcom/join/mgps/Util/q1;
.super Ljava/lang/Object;
.source "QuarkUtil.java"


# static fields
.field private static a:Lcom/join/mgps/dto/WebDiskPositionBean; = null

.field public static final b:Ljava/lang/String; = "com.quark.browser"

.field public static final c:Ljava/lang/String; = "3875871586"

.field public static final d:Ljava/lang/String; = "2057111073"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a()V
    .locals 3

    .line 1
    sget-object v0, Lcom/join/mgps/Util/q1;->a:Lcom/join/mgps/dto/WebDiskPositionBean;

    if-nez v0, :cond_0

    .line 2
    sget-object v0, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-virtual {v0}, Lcom/MApplication;->l()Lcom/join/mgps/pref/PrefDef_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->web_disk_position()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 3
    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 4
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v1

    const-class v2, Lcom/join/mgps/dto/WebDiskPositionBean;

    invoke-virtual {v1, v0, v2}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/WebDiskPositionBean;

    sput-object v0, Lcom/join/mgps/Util/q1;->a:Lcom/join/mgps/dto/WebDiskPositionBean;

    :cond_0
    return-void
.end method

.method public static b()Z
    .locals 2

    .line 1
    sget-object v0, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-virtual {v0}, Lcom/MApplication;->l()Lcom/join/mgps/pref/PrefDef_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->ab_side()Lorg/androidannotations/api/sharedpreferences/i;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public static c(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z
    .locals 0

    const/4 p0, 0x0

    if-nez p1, :cond_0

    return p0

    .line 1
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/join/mgps/Util/q1;->f(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 2
    sget-object p1, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-virtual {p1}, Lcom/MApplication;->l()Lcom/join/mgps/pref/PrefDef_;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/pref/PrefDef_;->isQuarkSilentDownload()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    move-exception p1

    .line 3
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_1
    return p0
.end method

.method public static d(I)Z
    .locals 1

    const/16 v0, 0x86

    if-ne v0, p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static e(Ljava/util/ArrayList;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/join/mgps/dto/TipBean;",
            ">;)Z"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p0, :cond_2

    .line 1
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-gtz v1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/TipBean;

    .line 3
    invoke-virtual {v1}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v1

    const-string v2, "134"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v0, 0x1

    :cond_2
    :goto_0
    return v0
.end method

.method public static f(Ljava/lang/String;)Z
    .locals 1

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "com.quark.browser"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static g()Z
    .locals 3

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/q1;->b()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    .line 2
    sget-object v0, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-virtual {v0}, Lcom/MApplication;->l()Lcom/join/mgps/pref/PrefDef_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->isBsideInt()Lorg/androidannotations/api/sharedpreferences/i;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v2, 0x2

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    :cond_1
    :goto_0
    return v1
.end method

.method private static h()Z
    .locals 2

    const/4 v0, 0x0

    .line 1
    :try_start_0
    sget-object v1, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-virtual {v1}, Lcom/MApplication;->l()Lcom/join/mgps/pref/PrefDef_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/pref/PrefDef_;->isQuarkEnable()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object v1

    invoke-virtual {v1}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Lcom/join/mgps/Util/q1;->g()Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0

    :catch_0
    move-exception v1

    .line 2
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    return v0
.end method

.method public static i(Ljava/util/ArrayList;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/join/mgps/dto/TipBean;",
            ">;)Z"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p0, :cond_3

    .line 1
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-gtz v1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/TipBean;

    .line 3
    invoke-virtual {v1}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v2

    const-string v3, "134"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {v1}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v1

    const-string v2, "23"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_2
    const/4 v0, 0x1

    :cond_3
    :goto_0
    return v0
.end method

.method public static j()Z
    .locals 9

    .line 1
    sget-object v0, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-virtual {v0}, Lcom/MApplication;->l()Lcom/join/mgps/pref/PrefDef_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->quark_display_mode()Lorg/androidannotations/api/sharedpreferences/i;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 2
    :cond_0
    sget-object v0, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-virtual {v0}, Lcom/MApplication;->l()Lcom/join/mgps/pref/PrefDef_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->quark_display_mode()Lorg/androidannotations/api/sharedpreferences/i;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    return v2

    .line 3
    :cond_1
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    const-string v3, "3875871586"

    invoke-virtual {v0, v3}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 4
    sget-object v3, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-virtual {v3}, Lcom/MApplication;->l()Lcom/join/mgps/pref/PrefDef_;

    move-result-object v3

    invoke-virtual {v3}, Lcom/join/mgps/pref/PrefDef_;->quark_display_mode()Lorg/androidannotations/api/sharedpreferences/i;

    move-result-object v3

    invoke-virtual {v3}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    mul-int/lit16 v3, v3, 0xe10

    mul-int/lit16 v3, v3, 0x3e8

    int-to-long v3, v3

    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getOpenTime()J

    move-result-wide v7

    sub-long/2addr v5, v7

    cmp-long v0, v5, v3

    if-lez v0, :cond_2

    return v2

    :cond_2
    return v1
.end method

.method public static k(Ljava/lang/String;I)Z
    .locals 2

    .line 1
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getMindPackageManager()Lcom/xinzhu/overmind/client/frameworks/g;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/xinzhu/overmind/client/frameworks/g;->k(Ljava/lang/String;)Lcom/xinzhu/overmind/server/pm/MindPackageSettings;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lcom/xinzhu/overmind/server/pm/MindPackageSettings;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/xinzhu/overmind/plugin/b;->i()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return p0

    .line 3
    :cond_0
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->get()Lcom/xinzhu/overmind/Overmind;

    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getMindPackageManager()Lcom/xinzhu/overmind/client/frameworks/g;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lcom/xinzhu/overmind/client/frameworks/g;->j(Ljava/lang/String;I)Landroid/content/Intent;

    move-result-object p0

    const-string v0, "com.quark.browser"

    .line 4
    invoke-virtual {p0, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    const/high16 v0, 0x10000000

    .line 5
    invoke-virtual {p0, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 6
    sget-object v0, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-virtual {v0}, Lcom/MApplication;->l()Lcom/join/mgps/pref/PrefDef_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->has_launch_quark()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 7
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/join/mgps/Util/q1$a;

    invoke-direct {v1, p0, p1}, Lcom/join/mgps/Util/q1$a;-><init>(Landroid/content/Intent;I)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 8
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    const/4 p0, 0x1

    return p0
.end method

.method public static l(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "3875871586"

    .line 1
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-static {}, Lcom/join/mgps/va/overmind/d;->o()Lcom/join/mgps/va/overmind/d;

    move-result-object p0

    invoke-virtual {p0}, Lcom/join/mgps/va/overmind/d;->O()Z

    move-result p0

    if-eqz p0, :cond_0

    sget-object p0, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-virtual {p0}, Lcom/MApplication;->l()Lcom/join/mgps/pref/PrefDef_;

    move-result-object p0

    invoke-virtual {p0}, Lcom/join/mgps/pref/PrefDef_;->has_launch_quark()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object p0

    invoke-virtual {p0}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static m()Z
    .locals 3

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/q1;->a()V

    .line 2
    sget-object v0, Lcom/join/mgps/Util/q1;->a:Lcom/join/mgps/dto/WebDiskPositionBean;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/join/mgps/dto/WebDiskPositionBean;->getPc_game()Lcom/join/mgps/dto/WebDiskPositionModeBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/WebDiskPositionModeBean;->getDownload_mode()Lcom/join/mgps/dto/WebDiskCfgDownLoadStateBean;

    move-result-object v0

    sget-object v2, Lcom/join/mgps/dto/WebDiskCfgDownLoadStateBean;->PRIVATE_DOMAIN:Lcom/join/mgps/dto/WebDiskCfgDownLoadStateBean;

    if-ne v0, v2, :cond_0

    const/4 v0, 0x1

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public static n()Z
    .locals 4

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/q1;->a()V

    .line 2
    sget-object v0, Lcom/join/mgps/Util/q1;->a:Lcom/join/mgps/dto/WebDiskPositionBean;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/join/mgps/dto/WebDiskPositionBean;->getSimulator_game()Lcom/join/mgps/dto/WebDiskPositionModeBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/WebDiskPositionModeBean;->getDownload_mode()Lcom/join/mgps/dto/WebDiskCfgDownLoadStateBean;

    move-result-object v0

    sget-object v3, Lcom/join/mgps/dto/WebDiskCfgDownLoadStateBean;->COMPLEX:Lcom/join/mgps/dto/WebDiskCfgDownLoadStateBean;

    if-ne v0, v3, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 4
    invoke-static {}, Lcom/join/mgps/Util/q1;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    return v1
.end method

.method public static o()Z
    .locals 3

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/q1;->a()V

    .line 2
    sget-object v0, Lcom/join/mgps/Util/q1;->a:Lcom/join/mgps/dto/WebDiskPositionBean;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/join/mgps/dto/WebDiskPositionBean;->getSimulator_game()Lcom/join/mgps/dto/WebDiskPositionModeBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/WebDiskPositionModeBean;->getSetup_mode()Lcom/join/mgps/dto/WebDiskCfgSetupModelEnumBean;

    move-result-object v0

    sget-object v2, Lcom/join/mgps/dto/WebDiskCfgSetupModelEnumBean;->VM:Lcom/join/mgps/dto/WebDiskCfgSetupModelEnumBean;

    if-ne v0, v2, :cond_0

    invoke-static {}, Lcom/join/mgps/va/overmind/d;->o()Lcom/join/mgps/va/overmind/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/va/overmind/d;->O()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public static p()Z
    .locals 3

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/q1;->a()V

    .line 2
    sget-object v0, Lcom/join/mgps/Util/q1;->a:Lcom/join/mgps/dto/WebDiskPositionBean;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/join/mgps/dto/WebDiskPositionBean;->getPc_game()Lcom/join/mgps/dto/WebDiskPositionModeBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/WebDiskPositionModeBean;->getSetup_mode()Lcom/join/mgps/dto/WebDiskCfgSetupModelEnumBean;

    move-result-object v0

    sget-object v2, Lcom/join/mgps/dto/WebDiskCfgSetupModelEnumBean;->VM:Lcom/join/mgps/dto/WebDiskCfgSetupModelEnumBean;

    if-ne v0, v2, :cond_0

    invoke-static {}, Lcom/join/mgps/va/overmind/d;->o()Lcom/join/mgps/va/overmind/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/va/overmind/d;->O()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public static q()Z
    .locals 4

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/q1;->a()V

    .line 2
    sget-object v0, Lcom/join/mgps/Util/q1;->a:Lcom/join/mgps/dto/WebDiskPositionBean;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/join/mgps/dto/WebDiskPositionBean;->getSingle_game()Lcom/join/mgps/dto/WebDiskPositionModeBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/WebDiskPositionModeBean;->getDownload_mode()Lcom/join/mgps/dto/WebDiskCfgDownLoadStateBean;

    move-result-object v0

    sget-object v3, Lcom/join/mgps/dto/WebDiskCfgDownLoadStateBean;->COMPLEX:Lcom/join/mgps/dto/WebDiskCfgDownLoadStateBean;

    if-ne v0, v3, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 4
    invoke-static {}, Lcom/join/mgps/Util/q1;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    return v1
.end method

.method public static r()Z
    .locals 3

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/q1;->a()V

    .line 2
    sget-object v0, Lcom/join/mgps/Util/q1;->a:Lcom/join/mgps/dto/WebDiskPositionBean;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/join/mgps/dto/WebDiskPositionBean;->getSingle_game()Lcom/join/mgps/dto/WebDiskPositionModeBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/WebDiskPositionModeBean;->getSetup_mode()Lcom/join/mgps/dto/WebDiskCfgSetupModelEnumBean;

    move-result-object v0

    sget-object v2, Lcom/join/mgps/dto/WebDiskCfgSetupModelEnumBean;->VM:Lcom/join/mgps/dto/WebDiskCfgSetupModelEnumBean;

    if-ne v0, v2, :cond_0

    invoke-static {}, Lcom/join/mgps/va/overmind/d;->o()Lcom/join/mgps/va/overmind/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/va/overmind/d;->O()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public static s()Z
    .locals 3

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/q1;->a()V

    .line 2
    sget-object v0, Lcom/join/mgps/Util/q1;->a:Lcom/join/mgps/dto/WebDiskPositionBean;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/join/mgps/dto/WebDiskPositionBean;->getPc_game()Lcom/join/mgps/dto/WebDiskPositionModeBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/WebDiskPositionModeBean;->getDownload_mode()Lcom/join/mgps/dto/WebDiskCfgDownLoadStateBean;

    move-result-object v0

    sget-object v2, Lcom/join/mgps/dto/WebDiskCfgDownLoadStateBean;->WEB_DISK:Lcom/join/mgps/dto/WebDiskCfgDownLoadStateBean;

    if-ne v0, v2, :cond_0

    const/4 v0, 0x1

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public static t(Landroid/content/Context;Lcom/papa/sim/statistic/Event;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    .line 1
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v4

    .line 2
    invoke-static {}, Lcom/join/mgps/Util/q1;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    sget-object v0, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-virtual {v0}, Lcom/MApplication;->l()Lcom/join/mgps/pref/PrefDef_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->isBsideInt()Lorg/androidannotations/api/sharedpreferences/i;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    move v6, v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    const/4 v6, 0x0

    .line 4
    :goto_0
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v1

    move-object v2, p1

    move-object v3, p2

    move-object v5, p3

    invoke-virtual/range {v1 .. v6}, Lcom/papa/sim/statistic/p;->S1(Lcom/papa/sim/statistic/Event;Ljava/lang/String;ILjava/lang/String;I)V

    return-void
.end method

.method public static u(Ljava/lang/String;)Z
    .locals 3

    const-string v0, "2057111073"

    .line 1
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const-string v0, "3875871586"

    .line 2
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {p0}, Lcom/join/mgps/Util/q1;->l(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    return v1

    .line 3
    :cond_1
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    invoke-static {}, Lcom/join/mgps/Util/q1;->j()Z

    move-result p0

    if-eqz p0, :cond_2

    const/4 p0, 0x1

    return p0

    :cond_2
    return v1
.end method

.method public static v()Z
    .locals 1

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/q1;->g()Z

    move-result v0

    return v0
.end method
