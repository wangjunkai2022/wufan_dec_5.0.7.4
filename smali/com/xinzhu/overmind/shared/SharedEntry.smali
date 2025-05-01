.class public final Lcom/xinzhu/overmind/shared/SharedEntry;
.super Lcom/join/mgps/va/overmind/VApp;
.source "SharedEntry.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/va/overmind/VApp;-><init>()V

    return-void
.end method


# virtual methods
.method public attachBaseContext(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/va/overmind/VApp;->attachBaseContext(Landroid/content/Context;)V

    .line 2
    :try_start_0
    new-instance v0, Lcom/xinzhu/overmind/shared/g;

    invoke-direct {v0}, Lcom/xinzhu/overmind/shared/g;-><init>()V

    .line 3
    invoke-virtual {v0, p1}, Lcom/xinzhu/overmind/shared/g;->g(Landroid/content/Context;)V

    .line 4
    invoke-virtual {v0}, Lcom/xinzhu/overmind/shared/g;->f()V

    .line 5
    invoke-static {}, Lcom/xinzhu/overmind/utils/e;->g()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 6
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->get()Lcom/xinzhu/overmind/Overmind;

    move-result-object p1

    const/4 v0, 0x0

    .line 7
    invoke-virtual {p1, v0}, Lcom/xinzhu/overmind/Overmind;->setXPEnable(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 8
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method

.method public onCreate()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/join/mgps/va/overmind/VApp;->onCreate()V

    .line 2
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->get()Lcom/xinzhu/overmind/Overmind;

    move-result-object v0

    invoke-virtual {v0}, Lcom/xinzhu/overmind/Overmind;->doCreate()V

    .line 3
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->get()Lcom/xinzhu/overmind/Overmind;

    move-result-object v0

    .line 4
    invoke-virtual {v0}, Lcom/xinzhu/overmind/Overmind;->isVirtualProcess()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->get()Lcom/xinzhu/overmind/Overmind;

    move-result-object v0

    .line 6
    new-instance v1, Lcom/xinzhu/overmind/shared/b;

    invoke-direct {v1}, Lcom/xinzhu/overmind/shared/b;-><init>()V

    invoke-virtual {v0, v1}, Lcom/xinzhu/overmind/Overmind;->setCustomCallback(Lcom/xinzhu/overmind/custom/CustomCallback;)V

    :cond_0
    return-void
.end method
