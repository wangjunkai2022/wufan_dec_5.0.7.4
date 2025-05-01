.class Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$b;
.super Ljava/lang/Object;
.source "SimulatorLaunchMomentFragment.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;->h0(Lcom/join/mgps/dto/SimulatorMomentBean;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$b;->b:Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;)I
    .locals 4

    const/4 v0, 0x0

    .line 1
    :try_start_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;->getDateStr()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p2}, Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;->getDateStr()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    const/4 v3, -0x1

    if-le v1, v2, :cond_0

    return v3

    .line 2
    :cond_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;->getDateStr()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p2}, Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;->getDateStr()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    if-ge v1, v2, :cond_1

    const/4 p1, 0x1

    return p1

    .line 3
    :cond_1
    invoke-virtual {p1}, Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;->getUid()Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$b;->b:Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;

    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 4
    invoke-virtual {p2}, Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;->getUid()Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$b;->b:Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;

    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object p2

    invoke-virtual {p2}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v3

    :cond_3
    return v0

    :catch_0
    move-exception p1

    .line 5
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    return v0
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;

    check-cast p2, Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;

    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$b;->a(Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;)I

    move-result p1

    return p1
.end method
