.class final Lcom/join/kotlin/ui/modleregin/BtReginActivity$adapter$2;
.super Lkotlin/jvm/internal/Lambda;
.source "BtReginActivity.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/ui/modleregin/BtReginActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lcom/join/kotlin/ui/modleregin/adapter/BtReginAdapter;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/kotlin/ui/modleregin/BtReginActivity;


# direct methods
.method constructor <init>(Lcom/join/kotlin/ui/modleregin/BtReginActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/ui/modleregin/BtReginActivity$adapter$2;->this$0:Lcom/join/kotlin/ui/modleregin/BtReginActivity;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Lcom/join/kotlin/ui/modleregin/adapter/BtReginAdapter;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    new-instance v0, Lcom/join/kotlin/ui/modleregin/adapter/BtReginAdapter;

    iget-object v1, p0, Lcom/join/kotlin/ui/modleregin/BtReginActivity$adapter$2;->this$0:Lcom/join/kotlin/ui/modleregin/BtReginActivity;

    invoke-virtual {v1}, Lcom/join/kotlin/ui/modleregin/BtReginActivity;->getVideoHelper()Lcom/join/android/app/component/video/c;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/join/kotlin/ui/modleregin/adapter/BtReginAdapter;-><init>(Landroidx/appcompat/app/AppCompatActivity;Lcom/join/android/app/component/video/c;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/join/kotlin/ui/modleregin/BtReginActivity$adapter$2;->invoke()Lcom/join/kotlin/ui/modleregin/adapter/BtReginAdapter;

    move-result-object v0

    return-object v0
.end method
