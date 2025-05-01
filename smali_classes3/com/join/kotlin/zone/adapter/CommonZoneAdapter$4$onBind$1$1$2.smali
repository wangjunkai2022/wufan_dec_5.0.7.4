.class public final Lcom/join/kotlin/zone/adapter/CommonZoneAdapter$4$onBind$1$1$2;
.super Lw1/p;
.source "CommonZoneAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/zone/adapter/CommonZoneAdapter$4;->onBind(Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;ILcom/join/kotlin/zone/model/bean/ZoneMultiEntry;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic $this_run:Lcom/join/mgps/dto/CommonGameInfoBean;

.field final synthetic this$0:Lcom/join/kotlin/zone/adapter/CommonZoneAdapter;


# direct methods
.method constructor <init>(Lcom/join/kotlin/zone/adapter/CommonZoneAdapter;Lcom/join/mgps/dto/CommonGameInfoBean;)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/zone/adapter/CommonZoneAdapter$4$onBind$1$1$2;->this$0:Lcom/join/kotlin/zone/adapter/CommonZoneAdapter;

    iput-object p2, p0, Lcom/join/kotlin/zone/adapter/CommonZoneAdapter$4$onBind$1$1$2;->$this_run:Lcom/join/mgps/dto/CommonGameInfoBean;

    .line 1
    invoke-direct {p0}, Lw1/p;-><init>()V

    return-void
.end method


# virtual methods
.method public varargs onClickBlank(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # [Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "s"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "objects"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    array-length v0, p2

    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    invoke-super {p0, p1, p2}, Lw1/p;->onClickBlank(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p1

    iget-object p2, p0, Lcom/join/kotlin/zone/adapter/CommonZoneAdapter$4$onBind$1$1$2;->this$0:Lcom/join/kotlin/zone/adapter/CommonZoneAdapter;

    invoke-virtual {p2}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getContext()Landroid/content/Context;

    move-result-object p2

    iget-object v0, p0, Lcom/join/kotlin/zone/adapter/CommonZoneAdapter$4$onBind$1$1$2;->$this_run:Lcom/join/mgps/dto/CommonGameInfoBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/CommonGameInfoBean;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    return-void
.end method

.method public onClickCover()V
    .locals 3

    .line 1
    invoke-super {p0}, Lw1/p;->onClickCover()V

    .line 2
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    iget-object v1, p0, Lcom/join/kotlin/zone/adapter/CommonZoneAdapter$4$onBind$1$1$2;->this$0:Lcom/join/kotlin/zone/adapter/CommonZoneAdapter;

    invoke-virtual {v1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/join/kotlin/zone/adapter/CommonZoneAdapter$4$onBind$1$1$2;->$this_run:Lcom/join/mgps/dto/CommonGameInfoBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    return-void
.end method
