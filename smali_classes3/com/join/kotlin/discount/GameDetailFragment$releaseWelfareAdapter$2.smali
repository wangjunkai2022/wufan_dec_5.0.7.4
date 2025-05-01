.class final Lcom/join/kotlin/discount/GameDetailFragment$releaseWelfareAdapter$2;
.super Lkotlin/jvm/internal/Lambda;
.source "GameDetailFragment.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/discount/GameDetailFragment;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lcom/join/kotlin/discount/adapter/GameDetailReleaseWelfareAdapter;",
        ">;"
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/join/kotlin/discount/GameDetailFragment$releaseWelfareAdapter$2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/join/kotlin/discount/GameDetailFragment$releaseWelfareAdapter$2;

    invoke-direct {v0}, Lcom/join/kotlin/discount/GameDetailFragment$releaseWelfareAdapter$2;-><init>()V

    sput-object v0, Lcom/join/kotlin/discount/GameDetailFragment$releaseWelfareAdapter$2;->INSTANCE:Lcom/join/kotlin/discount/GameDetailFragment$releaseWelfareAdapter$2;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Lcom/join/kotlin/discount/adapter/GameDetailReleaseWelfareAdapter;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 2
    new-instance v0, Lcom/join/kotlin/discount/adapter/GameDetailReleaseWelfareAdapter;

    invoke-direct {v0}, Lcom/join/kotlin/discount/adapter/GameDetailReleaseWelfareAdapter;-><init>()V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/discount/GameDetailFragment$releaseWelfareAdapter$2;->invoke()Lcom/join/kotlin/discount/adapter/GameDetailReleaseWelfareAdapter;

    move-result-object v0

    return-object v0
.end method
