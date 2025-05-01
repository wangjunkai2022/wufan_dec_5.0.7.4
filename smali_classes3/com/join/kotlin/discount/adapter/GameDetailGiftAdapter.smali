.class public final Lcom/join/kotlin/discount/adapter/GameDetailGiftAdapter;
.super Lcom/chad/library/adapter/base/BaseMultiItemAdapter;
.source "GameDetailGiftAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/kotlin/discount/adapter/GameDetailGiftAdapter$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/chad/library/adapter/base/BaseMultiItemAdapter<",
        "Lcom/join/kotlin/discount/model/bean/GameDetailGiftEntityBean;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGameDetailGiftAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameDetailGiftAdapter.kt\ncom/join/kotlin/discount/adapter/GameDetailGiftAdapter\n+ 2 BaseMultiItemAdapter.kt\ncom/chad/library/adapter/base/BaseMultiItemAdapter\n*L\n1#1,74:1\n54#2:75\n54#2:76\n*S KotlinDebug\n*F\n+ 1 GameDetailGiftAdapter.kt\ncom/join/kotlin/discount/adapter/GameDetailGiftAdapter\n*L\n22#1:75\n44#1:76\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nGameDetailGiftAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameDetailGiftAdapter.kt\ncom/join/kotlin/discount/adapter/GameDetailGiftAdapter\n+ 2 BaseMultiItemAdapter.kt\ncom/chad/library/adapter/base/BaseMultiItemAdapter\n*L\n1#1,74:1\n54#2:75\n54#2:76\n*S KotlinDebug\n*F\n+ 1 GameDetailGiftAdapter.kt\ncom/join/kotlin/discount/adapter/GameDetailGiftAdapter\n*L\n22#1:75\n44#1:76\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/join/kotlin/discount/adapter/GameDetailGiftAdapter$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final TYPE_GIFT_CONTENT:I = 0x2

.field public static final TYPE_GIFT_TITLE:I = 0x1


# instance fields
.field private click:Lcom/join/kotlin/discount/proxy/GameDetailGiftClickProxy;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/join/kotlin/discount/adapter/GameDetailGiftAdapter$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/join/kotlin/discount/adapter/GameDetailGiftAdapter$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/join/kotlin/discount/adapter/GameDetailGiftAdapter;->Companion:Lcom/join/kotlin/discount/adapter/GameDetailGiftAdapter$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const-class v0, Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {p0, v1, v2, v1}, Lcom/chad/library/adapter/base/BaseMultiItemAdapter;-><init>(Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 2
    new-instance v1, Lcom/join/kotlin/discount/adapter/GameDetailGiftAdapter$1;

    invoke-direct {v1}, Lcom/join/kotlin/discount/adapter/GameDetailGiftAdapter$1;-><init>()V

    .line 3
    invoke-virtual {p0, v2, v0, v1}, Lcom/chad/library/adapter/base/BaseMultiItemAdapter;->addItemType(ILjava/lang/Class;Lcom/chad/library/adapter/base/BaseMultiItemAdapter$b;)Lcom/chad/library/adapter/base/BaseMultiItemAdapter;

    .line 4
    new-instance v1, Lcom/join/kotlin/discount/adapter/GameDetailGiftAdapter$2;

    invoke-direct {v1, p0}, Lcom/join/kotlin/discount/adapter/GameDetailGiftAdapter$2;-><init>(Lcom/join/kotlin/discount/adapter/GameDetailGiftAdapter;)V

    const/4 v2, 0x2

    .line 5
    invoke-virtual {p0, v2, v0, v1}, Lcom/chad/library/adapter/base/BaseMultiItemAdapter;->addItemType(ILjava/lang/Class;Lcom/chad/library/adapter/base/BaseMultiItemAdapter$b;)Lcom/chad/library/adapter/base/BaseMultiItemAdapter;

    .line 6
    new-instance v0, Lcom/join/kotlin/discount/adapter/GameDetailGiftAdapter$3;

    invoke-direct {v0}, Lcom/join/kotlin/discount/adapter/GameDetailGiftAdapter$3;-><init>()V

    invoke-virtual {p0, v0}, Lcom/chad/library/adapter/base/BaseMultiItemAdapter;->onItemViewType(Lcom/chad/library/adapter/base/BaseMultiItemAdapter$a;)Lcom/chad/library/adapter/base/BaseMultiItemAdapter;

    return-void
.end method


# virtual methods
.method public final getClick()Lcom/join/kotlin/discount/proxy/GameDetailGiftClickProxy;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/discount/adapter/GameDetailGiftAdapter;->click:Lcom/join/kotlin/discount/proxy/GameDetailGiftClickProxy;

    return-object v0
.end method

.method public final setClick(Lcom/join/kotlin/discount/proxy/GameDetailGiftClickProxy;)V
    .locals 0
    .param p1    # Lcom/join/kotlin/discount/proxy/GameDetailGiftClickProxy;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/discount/adapter/GameDetailGiftAdapter;->click:Lcom/join/kotlin/discount/proxy/GameDetailGiftClickProxy;

    return-void
.end method
