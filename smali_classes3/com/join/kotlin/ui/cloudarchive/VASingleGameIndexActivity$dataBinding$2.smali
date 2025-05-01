.class final Lcom/join/kotlin/ui/cloudarchive/VASingleGameIndexActivity$dataBinding$2;
.super Lkotlin/jvm/internal/Lambda;
.source "VASingleGameIndexActivity.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/ui/cloudarchive/VASingleGameIndexActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lcom/join/android/app/mgsim/wufun/databinding/ActivityVasingleGameIndexBinding;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/kotlin/ui/cloudarchive/VASingleGameIndexActivity;


# direct methods
.method constructor <init>(Lcom/join/kotlin/ui/cloudarchive/VASingleGameIndexActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/ui/cloudarchive/VASingleGameIndexActivity$dataBinding$2;->this$0:Lcom/join/kotlin/ui/cloudarchive/VASingleGameIndexActivity;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Lcom/join/android/app/mgsim/wufun/databinding/ActivityVasingleGameIndexBinding;
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/join/kotlin/ui/cloudarchive/VASingleGameIndexActivity$dataBinding$2;->this$0:Lcom/join/kotlin/ui/cloudarchive/VASingleGameIndexActivity;

    const v1, 0x7f0c00a9

    invoke-static {v0, v1}, Landroidx/databinding/DataBindingUtil;->setContentView(Landroid/app/Activity;I)Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityVasingleGameIndexBinding;

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/ui/cloudarchive/VASingleGameIndexActivity$dataBinding$2;->invoke()Lcom/join/android/app/mgsim/wufun/databinding/ActivityVasingleGameIndexBinding;

    move-result-object v0

    return-object v0
.end method
