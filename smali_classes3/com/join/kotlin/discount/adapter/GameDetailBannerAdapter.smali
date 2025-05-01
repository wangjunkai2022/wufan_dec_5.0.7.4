.class public final Lcom/join/kotlin/discount/adapter/GameDetailBannerAdapter;
.super Lcom/chad/library/adapter/base/BaseMultiItemAdapter;
.source "GameDetailBannerAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/kotlin/discount/adapter/GameDetailBannerAdapter$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/chad/library/adapter/base/BaseMultiItemAdapter<",
        "Lcom/join/kotlin/discount/model/bean/GameDetailBannerEntityBean;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGameDetailBannerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameDetailBannerAdapter.kt\ncom/join/kotlin/discount/adapter/GameDetailBannerAdapter\n+ 2 BaseMultiItemAdapter.kt\ncom/chad/library/adapter/base/BaseMultiItemAdapter\n*L\n1#1,214:1\n54#2:215\n54#2:216\n54#2:217\n54#2:218\n54#2:219\n*S KotlinDebug\n*F\n+ 1 GameDetailBannerAdapter.kt\ncom/join/kotlin/discount/adapter/GameDetailBannerAdapter\n*L\n29#1:215\n73#1:216\n105#1:217\n146#1:218\n178#1:219\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nGameDetailBannerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameDetailBannerAdapter.kt\ncom/join/kotlin/discount/adapter/GameDetailBannerAdapter\n+ 2 BaseMultiItemAdapter.kt\ncom/chad/library/adapter/base/BaseMultiItemAdapter\n*L\n1#1,214:1\n54#2:215\n54#2:216\n54#2:217\n54#2:218\n54#2:219\n*S KotlinDebug\n*F\n+ 1 GameDetailBannerAdapter.kt\ncom/join/kotlin/discount/adapter/GameDetailBannerAdapter\n*L\n29#1:215\n73#1:216\n105#1:217\n146#1:218\n178#1:219\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/join/kotlin/discount/adapter/GameDetailBannerAdapter$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final TYPE_PIC_H:I = 0x2

.field public static final TYPE_PIC_V:I = 0x3

.field public static final TYPE_PIC_V_SINGLE:I = 0x4

.field public static final TYPE_PLACEHOLDER:I = 0x5

.field public static final TYPE_VIDEO:I = 0x1


# instance fields
.field private click:Lcom/join/kotlin/discount/proxy/GameDetailFragmentClickProxy;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/join/kotlin/discount/adapter/GameDetailBannerAdapter$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/join/kotlin/discount/adapter/GameDetailBannerAdapter$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/join/kotlin/discount/adapter/GameDetailBannerAdapter;->Companion:Lcom/join/kotlin/discount/adapter/GameDetailBannerAdapter$Companion;

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
    new-instance v1, Lcom/join/kotlin/discount/adapter/GameDetailBannerAdapter$1;

    invoke-direct {v1}, Lcom/join/kotlin/discount/adapter/GameDetailBannerAdapter$1;-><init>()V

    .line 3
    invoke-virtual {p0, v2, v0, v1}, Lcom/chad/library/adapter/base/BaseMultiItemAdapter;->addItemType(ILjava/lang/Class;Lcom/chad/library/adapter/base/BaseMultiItemAdapter$b;)Lcom/chad/library/adapter/base/BaseMultiItemAdapter;

    .line 4
    new-instance v1, Lcom/join/kotlin/discount/adapter/GameDetailBannerAdapter$2;

    invoke-direct {v1, p0}, Lcom/join/kotlin/discount/adapter/GameDetailBannerAdapter$2;-><init>(Lcom/join/kotlin/discount/adapter/GameDetailBannerAdapter;)V

    const/4 v2, 0x2

    .line 5
    invoke-virtual {p0, v2, v0, v1}, Lcom/chad/library/adapter/base/BaseMultiItemAdapter;->addItemType(ILjava/lang/Class;Lcom/chad/library/adapter/base/BaseMultiItemAdapter$b;)Lcom/chad/library/adapter/base/BaseMultiItemAdapter;

    .line 6
    new-instance v1, Lcom/join/kotlin/discount/adapter/GameDetailBannerAdapter$3;

    invoke-direct {v1, p0}, Lcom/join/kotlin/discount/adapter/GameDetailBannerAdapter$3;-><init>(Lcom/join/kotlin/discount/adapter/GameDetailBannerAdapter;)V

    const/4 v2, 0x3

    .line 7
    invoke-virtual {p0, v2, v0, v1}, Lcom/chad/library/adapter/base/BaseMultiItemAdapter;->addItemType(ILjava/lang/Class;Lcom/chad/library/adapter/base/BaseMultiItemAdapter$b;)Lcom/chad/library/adapter/base/BaseMultiItemAdapter;

    .line 8
    new-instance v1, Lcom/join/kotlin/discount/adapter/GameDetailBannerAdapter$4;

    invoke-direct {v1, p0}, Lcom/join/kotlin/discount/adapter/GameDetailBannerAdapter$4;-><init>(Lcom/join/kotlin/discount/adapter/GameDetailBannerAdapter;)V

    const/4 v2, 0x4

    .line 9
    invoke-virtual {p0, v2, v0, v1}, Lcom/chad/library/adapter/base/BaseMultiItemAdapter;->addItemType(ILjava/lang/Class;Lcom/chad/library/adapter/base/BaseMultiItemAdapter$b;)Lcom/chad/library/adapter/base/BaseMultiItemAdapter;

    .line 10
    new-instance v1, Lcom/join/kotlin/discount/adapter/GameDetailBannerAdapter$5;

    invoke-direct {v1}, Lcom/join/kotlin/discount/adapter/GameDetailBannerAdapter$5;-><init>()V

    const/4 v2, 0x5

    .line 11
    invoke-virtual {p0, v2, v0, v1}, Lcom/chad/library/adapter/base/BaseMultiItemAdapter;->addItemType(ILjava/lang/Class;Lcom/chad/library/adapter/base/BaseMultiItemAdapter$b;)Lcom/chad/library/adapter/base/BaseMultiItemAdapter;

    .line 12
    new-instance v0, Lcom/join/kotlin/discount/adapter/GameDetailBannerAdapter$6;

    invoke-direct {v0}, Lcom/join/kotlin/discount/adapter/GameDetailBannerAdapter$6;-><init>()V

    invoke-virtual {p0, v0}, Lcom/chad/library/adapter/base/BaseMultiItemAdapter;->onItemViewType(Lcom/chad/library/adapter/base/BaseMultiItemAdapter$a;)Lcom/chad/library/adapter/base/BaseMultiItemAdapter;

    return-void
.end method


# virtual methods
.method public final getClick()Lcom/join/kotlin/discount/proxy/GameDetailFragmentClickProxy;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/discount/adapter/GameDetailBannerAdapter;->click:Lcom/join/kotlin/discount/proxy/GameDetailFragmentClickProxy;

    return-object v0
.end method

.method public final setClick(Lcom/join/kotlin/discount/proxy/GameDetailFragmentClickProxy;)V
    .locals 0
    .param p1    # Lcom/join/kotlin/discount/proxy/GameDetailFragmentClickProxy;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/discount/adapter/GameDetailBannerAdapter;->click:Lcom/join/kotlin/discount/proxy/GameDetailFragmentClickProxy;

    return-void
.end method
