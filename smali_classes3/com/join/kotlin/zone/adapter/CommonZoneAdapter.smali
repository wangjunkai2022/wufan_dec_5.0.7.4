.class public final Lcom/join/kotlin/zone/adapter/CommonZoneAdapter;
.super Lcom/chad/library/adapter/base/BaseMultiItemAdapter;
.source "CommonZoneAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/kotlin/zone/adapter/CommonZoneAdapter$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/chad/library/adapter/base/BaseMultiItemAdapter<",
        "Lcom/join/kotlin/zone/model/bean/ZoneMultiEntry;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCommonZoneAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonZoneAdapter.kt\ncom/join/kotlin/zone/adapter/CommonZoneAdapter\n+ 2 BaseMultiItemAdapter.kt\ncom/chad/library/adapter/base/BaseMultiItemAdapter\n*L\n1#1,219:1\n54#2:220\n54#2:221\n54#2:222\n54#2:223\n54#2:224\n54#2:225\n*S KotlinDebug\n*F\n+ 1 CommonZoneAdapter.kt\ncom/join/kotlin/zone/adapter/CommonZoneAdapter\n*L\n34#1:220\n47#1:221\n60#1:222\n84#1:223\n131#1:224\n154#1:225\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCommonZoneAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonZoneAdapter.kt\ncom/join/kotlin/zone/adapter/CommonZoneAdapter\n+ 2 BaseMultiItemAdapter.kt\ncom/chad/library/adapter/base/BaseMultiItemAdapter\n*L\n1#1,219:1\n54#2:220\n54#2:221\n54#2:222\n54#2:223\n54#2:224\n54#2:225\n*S KotlinDebug\n*F\n+ 1 CommonZoneAdapter.kt\ncom/join/kotlin/zone/adapter/CommonZoneAdapter\n*L\n34#1:220\n47#1:221\n60#1:222\n84#1:223\n131#1:224\n154#1:225\n*E\n"
    }
.end annotation


# static fields
.field public static final AD_PIC:I = 0x1

.field public static final CARD_GAME_INFO_BOTTOM:I = 0x3

.field public static final CARD_GAME_INFO_BOTTOM_VIDEO:I = 0x6

.field public static final CARD_GAME_INFO_INNER_BOTTOM:I = 0x4

.field public static final Companion:Lcom/join/kotlin/zone/adapter/CommonZoneAdapter$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final ITEM_GAME_INFO_BOTTOM:I = 0x5

.field public static final TITLE:I = 0x2


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/join/kotlin/zone/adapter/CommonZoneAdapter$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/join/kotlin/zone/adapter/CommonZoneAdapter$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/join/kotlin/zone/adapter/CommonZoneAdapter;->Companion:Lcom/join/kotlin/zone/adapter/CommonZoneAdapter$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 1
    invoke-direct {p0, v0, v1, v0}, Lcom/chad/library/adapter/base/BaseMultiItemAdapter;-><init>(Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/join/android/app/component/video/g;)V
    .locals 4
    .param p1    # Lcom/join/android/app/component/video/g;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 2
    const-class v0, Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;

    invoke-direct {p0}, Lcom/join/kotlin/zone/adapter/CommonZoneAdapter;-><init>()V

    .line 3
    new-instance v1, Lcom/join/kotlin/zone/adapter/CommonZoneAdapter$1;

    invoke-direct {v1}, Lcom/join/kotlin/zone/adapter/CommonZoneAdapter$1;-><init>()V

    const/4 v2, 0x1

    .line 4
    invoke-virtual {p0, v2, v0, v1}, Lcom/chad/library/adapter/base/BaseMultiItemAdapter;->addItemType(ILjava/lang/Class;Lcom/chad/library/adapter/base/BaseMultiItemAdapter$b;)Lcom/chad/library/adapter/base/BaseMultiItemAdapter;

    move-result-object v1

    .line 5
    new-instance v2, Lcom/join/kotlin/zone/adapter/CommonZoneAdapter$2;

    invoke-direct {v2}, Lcom/join/kotlin/zone/adapter/CommonZoneAdapter$2;-><init>()V

    const/4 v3, 0x2

    .line 6
    invoke-virtual {v1, v3, v0, v2}, Lcom/chad/library/adapter/base/BaseMultiItemAdapter;->addItemType(ILjava/lang/Class;Lcom/chad/library/adapter/base/BaseMultiItemAdapter$b;)Lcom/chad/library/adapter/base/BaseMultiItemAdapter;

    move-result-object v1

    .line 7
    new-instance v2, Lcom/join/kotlin/zone/adapter/CommonZoneAdapter$3;

    invoke-direct {v2, p0}, Lcom/join/kotlin/zone/adapter/CommonZoneAdapter$3;-><init>(Lcom/join/kotlin/zone/adapter/CommonZoneAdapter;)V

    const/4 v3, 0x3

    .line 8
    invoke-virtual {v1, v3, v0, v2}, Lcom/chad/library/adapter/base/BaseMultiItemAdapter;->addItemType(ILjava/lang/Class;Lcom/chad/library/adapter/base/BaseMultiItemAdapter$b;)Lcom/chad/library/adapter/base/BaseMultiItemAdapter;

    move-result-object v1

    .line 9
    new-instance v2, Lcom/join/kotlin/zone/adapter/CommonZoneAdapter$4;

    invoke-direct {v2, p1, p0}, Lcom/join/kotlin/zone/adapter/CommonZoneAdapter$4;-><init>(Lcom/join/android/app/component/video/g;Lcom/join/kotlin/zone/adapter/CommonZoneAdapter;)V

    const/4 p1, 0x6

    .line 10
    invoke-virtual {v1, p1, v0, v2}, Lcom/chad/library/adapter/base/BaseMultiItemAdapter;->addItemType(ILjava/lang/Class;Lcom/chad/library/adapter/base/BaseMultiItemAdapter$b;)Lcom/chad/library/adapter/base/BaseMultiItemAdapter;

    move-result-object p1

    .line 11
    new-instance v1, Lcom/join/kotlin/zone/adapter/CommonZoneAdapter$5;

    invoke-direct {v1, p0}, Lcom/join/kotlin/zone/adapter/CommonZoneAdapter$5;-><init>(Lcom/join/kotlin/zone/adapter/CommonZoneAdapter;)V

    const/4 v2, 0x4

    .line 12
    invoke-virtual {p1, v2, v0, v1}, Lcom/chad/library/adapter/base/BaseMultiItemAdapter;->addItemType(ILjava/lang/Class;Lcom/chad/library/adapter/base/BaseMultiItemAdapter$b;)Lcom/chad/library/adapter/base/BaseMultiItemAdapter;

    move-result-object p1

    .line 13
    new-instance v1, Lcom/join/kotlin/zone/adapter/CommonZoneAdapter$6;

    invoke-direct {v1, p0}, Lcom/join/kotlin/zone/adapter/CommonZoneAdapter$6;-><init>(Lcom/join/kotlin/zone/adapter/CommonZoneAdapter;)V

    const/4 v2, 0x5

    .line 14
    invoke-virtual {p1, v2, v0, v1}, Lcom/chad/library/adapter/base/BaseMultiItemAdapter;->addItemType(ILjava/lang/Class;Lcom/chad/library/adapter/base/BaseMultiItemAdapter$b;)Lcom/chad/library/adapter/base/BaseMultiItemAdapter;

    .line 15
    new-instance p1, Lcom/join/kotlin/zone/adapter/CommonZoneAdapter$7;

    invoke-direct {p1}, Lcom/join/kotlin/zone/adapter/CommonZoneAdapter$7;-><init>()V

    invoke-virtual {p0, p1}, Lcom/chad/library/adapter/base/BaseMultiItemAdapter;->onItemViewType(Lcom/chad/library/adapter/base/BaseMultiItemAdapter$a;)Lcom/chad/library/adapter/base/BaseMultiItemAdapter;

    return-void
.end method


# virtual methods
.method public final addTags(Landroid/widget/LinearLayout;Ljava/util/List;Lcom/join/mgps/dto/TipNew;)V
    .locals 10
    .param p1    # Landroid/widget/LinearLayout;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/join/mgps/dto/TipNew;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/LinearLayout;",
            "Ljava/util/List<",
            "+",
            "Lcom/join/mgps/dto/TipBean;",
            ">;",
            "Lcom/join/mgps/dto/TipNew;",
            ")V"
        }
    .end annotation

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Landroid/widget/LinearLayout;->removeAllViews()V

    const v0, 0x7f091693

    const v1, 0x7f0c0428

    const v2, 0x7f0711f4

    const/4 v3, 0x0

    const/4 v4, -0x2

    if-eqz p3, :cond_2

    .line 2
    invoke-virtual {p3}, Lcom/join/mgps/dto/TipNew;->getModel()Lcom/join/mgps/dto/TipBean;

    move-result-object v5

    if-eqz v5, :cond_2

    .line 3
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v5, v4, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 4
    invoke-virtual {p1}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v6

    float-to-int v6, v6

    iput v6, v5, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 5
    invoke-virtual {p1}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-static {v6, v1, v3}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v6

    .line 6
    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    .line 7
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v9, "\u5e73\u53f0: "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Lcom/join/mgps/dto/TipNew;->getModel()Lcom/join/mgps/dto/TipBean;

    move-result-object p3

    invoke-virtual {p3}, Lcom/join/mgps/dto/TipBean;->getName()Ljava/lang/String;

    move-result-object p3

    if-eqz p3, :cond_1

    invoke-virtual {p3}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p3

    const-string/jumbo v9, "this as java.lang.String).toUpperCase()"

    invoke-static {p3, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object p3, v3

    :goto_0
    invoke-virtual {v8, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v7, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8
    invoke-virtual {p1, v6, v5}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_2
    if-eqz p2, :cond_3

    .line 9
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result p3

    xor-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_3

    const/4 p3, 0x0

    .line 10
    invoke-interface {p2, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/dto/TipBean;

    .line 11
    new-instance p3, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {p3, v4, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 12
    invoke-virtual {p1}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    float-to-int v2, v2

    iput v2, p3, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 13
    invoke-virtual {p1}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v1, v3}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 14
    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 15
    invoke-virtual {p2}, Lcom/join/mgps/dto/TipBean;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 16
    invoke-virtual {p1, v1, p3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 17
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_3
    :goto_1
    return-void
.end method

.method public final fillLabel(Landroid/widget/TextView;Ljava/util/List;Lcom/join/mgps/dto/TipNew;)V
    .locals 1
    .param p1    # Landroid/widget/TextView;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/join/mgps/dto/TipNew;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/TextView;",
            "Ljava/util/List<",
            "+",
            "Lcom/join/mgps/dto/TipBean;",
            ">;",
            "Lcom/join/mgps/dto/TipNew;",
            ")V"
        }
    .end annotation

    if-nez p1, :cond_0

    return-void

    :cond_0
    const-string v0, " | "

    .line 1
    invoke-static {p3, p2, v0}, Lcom/join/mgps/Util/UtilsMy;->N1(Lcom/join/mgps/dto/TipNew;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
