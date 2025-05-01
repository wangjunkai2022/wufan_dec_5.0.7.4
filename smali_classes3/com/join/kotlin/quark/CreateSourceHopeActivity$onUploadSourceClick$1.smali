.class public final Lcom/join/kotlin/quark/CreateSourceHopeActivity$onUploadSourceClick$1;
.super Lcom/join/kotlin/quark/callback/impl/DialogShareSourceCallbackImpl;
.source "CreateSourceHopeActivity.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/quark/CreateSourceHopeActivity;->onUploadSourceClick(Lcom/join/kotlin/quark/model/bean/SourceListItemBean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/kotlin/quark/CreateSourceHopeActivity;


# direct methods
.method constructor <init>(Lcom/join/kotlin/quark/CreateSourceHopeActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/quark/CreateSourceHopeActivity$onUploadSourceClick$1;->this$0:Lcom/join/kotlin/quark/CreateSourceHopeActivity;

    .line 1
    invoke-direct {p0}, Lcom/join/kotlin/quark/callback/impl/DialogShareSourceCallbackImpl;-><init>()V

    return-void
.end method


# virtual methods
.method public onSuccess()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/quark/CreateSourceHopeActivity$onUploadSourceClick$1;->this$0:Lcom/join/kotlin/quark/CreateSourceHopeActivity;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/join/kotlin/quark/CreateSourceHopeActivity;->loadData(Z)V

    return-void
.end method
