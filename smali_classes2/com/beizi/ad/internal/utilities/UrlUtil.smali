.class public Lcom/beizi/ad/internal/utilities/UrlUtil;
.super Ljava/lang/Object;
.source "UrlUtil.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/beizi/ad/internal/utilities/UrlUtil$DNSResolver;
    }
.end annotation


# static fields
.field public static CLT_TYPE:Ljava/lang/String; = "__CLT__"

.field public static CLT_TYPE_999:Ljava/lang/String; = "__CLT-999__"

.field public static E_TS_E:Ljava/lang/String; = ".EVENT_TS_END."

.field public static E_TS_S:Ljava/lang/String; = ".EVENT_TS_START."

.field public static RAW_X_DOWN:Ljava/lang/String; = ".SCRN_CLK_PT_DOWN_X."

.field public static RAW_X_DOWN_DP:Ljava/lang/String; = ".SCRN_CLK_PT_DOWN_X_DP."

.field public static RAW_X_UP:Ljava/lang/String; = ".SCRN_CLK_PT_UP_X."

.field public static RAW_X_UP_DP:Ljava/lang/String; = ".SCRN_CLK_PT_UP_X_DP."

.field public static RAW_Y_DOWN:Ljava/lang/String; = ".SCRN_CLK_PT_DOWN_Y."

.field public static RAW_Y_DOWN_DP:Ljava/lang/String; = ".SCRN_CLK_PT_DOWN_Y_DP."

.field public static RAW_Y_UP:Ljava/lang/String; = ".SCRN_CLK_PT_UP_Y."

.field public static RAW_Y_UP_DP:Ljava/lang/String; = ".SCRN_CLK_PT_UP_Y_DP."

.field public static TS:Ljava/lang/String; = ".UTC_TS."

.field public static V_D:Ljava/lang/String; = ".VIDEO_DURATION."

.field public static X_DOWN:Ljava/lang/String; = ".AD_CLK_PT_DOWN_X."

.field public static X_DOWN_DP:Ljava/lang/String; = ".AD_CLK_PT_DOWN_X_DP."

.field public static X_UP:Ljava/lang/String; = ".AD_CLK_PT_UP_X."

.field public static X_UP_DP:Ljava/lang/String; = ".AD_CLK_PT_UP_X_DP."

.field public static Y_DOWN:Ljava/lang/String; = ".AD_CLK_PT_DOWN_Y."

.field public static Y_DOWN_DP:Ljava/lang/String; = ".AD_CLK_PT_DOWN_Y_DP."

.field public static Y_UP:Ljava/lang/String; = ".AD_CLK_PT_UP_Y."

.field public static Y_UP_DP:Ljava/lang/String; = ".AD_CLK_PT_UP_Y_DP."


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static isSendTouchEventUrl(Ljava/lang/String;)Z
    .locals 2

    .line 1
    sget-object v0, Lcom/beizi/ad/internal/utilities/UrlUtil;->X_DOWN:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    .line 2
    sget-object v1, Lcom/beizi/ad/internal/utilities/UrlUtil;->Y_DOWN:Ljava/lang/String;

    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    add-int/lit8 v0, v0, 0x1

    .line 3
    :cond_0
    sget-object v1, Lcom/beizi/ad/internal/utilities/UrlUtil;->X_UP:Ljava/lang/String;

    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    add-int/lit8 v0, v0, 0x1

    .line 4
    :cond_1
    sget-object v1, Lcom/beizi/ad/internal/utilities/UrlUtil;->Y_UP:Ljava/lang/String;

    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2

    add-int/lit8 v0, v0, 0x1

    .line 5
    :cond_2
    sget-object v1, Lcom/beizi/ad/internal/utilities/UrlUtil;->RAW_X_DOWN:Ljava/lang/String;

    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_3

    add-int/lit8 v0, v0, 0x1

    .line 6
    :cond_3
    sget-object v1, Lcom/beizi/ad/internal/utilities/UrlUtil;->RAW_Y_DOWN:Ljava/lang/String;

    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_4

    add-int/lit8 v0, v0, 0x1

    .line 7
    :cond_4
    sget-object v1, Lcom/beizi/ad/internal/utilities/UrlUtil;->RAW_X_UP:Ljava/lang/String;

    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_5

    add-int/lit8 v0, v0, 0x1

    .line 8
    :cond_5
    sget-object v1, Lcom/beizi/ad/internal/utilities/UrlUtil;->RAW_Y_UP:Ljava/lang/String;

    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_6

    add-int/lit8 v0, v0, 0x1

    .line 9
    :cond_6
    sget-object v1, Lcom/beizi/ad/internal/utilities/UrlUtil;->TS:Ljava/lang/String;

    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_7

    add-int/lit8 v0, v0, 0x1

    :cond_7
    const/16 p0, 0x9

    if-ne v0, p0, :cond_8

    const/4 p0, 0x1

    goto :goto_0

    :cond_8
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static px2dip(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    :try_start_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "-999"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "0"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-static {p1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    double-to-long v0, v0

    long-to-float v0, v0

    .line 3
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p0

    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr v0, p0

    const/high16 p0, 0x3f000000    # 0.5f

    add-float/2addr v0, p0

    float-to-int p0, v0

    .line 4
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :cond_1
    :goto_0
    return-object p1

    :catchall_0
    move-exception p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    return-object p1
.end method

.method public static replaceToTouchEventUrl(Ljava/lang/String;Lcom/beizi/ad/c/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 75
    sget-object p2, Lcom/beizi/ad/internal/utilities/UrlUtil;->X_DOWN:Ljava/lang/String;

    invoke-virtual {p0, p2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Lcom/beizi/ad/c/c;->a()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_0

    .line 76
    sget-object p2, Lcom/beizi/ad/internal/utilities/UrlUtil;->X_DOWN:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/beizi/ad/c/c;->a()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p0, p2, p3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 77
    :cond_0
    sget-object p2, Lcom/beizi/ad/internal/utilities/UrlUtil;->Y_DOWN:Ljava/lang/String;

    invoke-virtual {p0, p2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Lcom/beizi/ad/c/c;->b()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_1

    .line 78
    sget-object p2, Lcom/beizi/ad/internal/utilities/UrlUtil;->Y_DOWN:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/beizi/ad/c/c;->b()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p0, p2, p3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 79
    :cond_1
    sget-object p2, Lcom/beizi/ad/internal/utilities/UrlUtil;->X_UP:Ljava/lang/String;

    invoke-virtual {p0, p2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-virtual {p1}, Lcom/beizi/ad/c/c;->e()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_2

    .line 80
    sget-object p2, Lcom/beizi/ad/internal/utilities/UrlUtil;->X_UP:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/beizi/ad/c/c;->e()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p0, p2, p3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 81
    :cond_2
    sget-object p2, Lcom/beizi/ad/internal/utilities/UrlUtil;->Y_UP:Ljava/lang/String;

    invoke-virtual {p0, p2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-virtual {p1}, Lcom/beizi/ad/c/c;->f()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_3

    .line 82
    sget-object p2, Lcom/beizi/ad/internal/utilities/UrlUtil;->Y_UP:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/beizi/ad/c/c;->f()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p0, p2, p3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 83
    :cond_3
    sget-object p2, Lcom/beizi/ad/internal/utilities/UrlUtil;->RAW_X_DOWN:Ljava/lang/String;

    invoke-virtual {p0, p2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-virtual {p1}, Lcom/beizi/ad/c/c;->c()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_4

    .line 84
    sget-object p2, Lcom/beizi/ad/internal/utilities/UrlUtil;->RAW_X_DOWN:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/beizi/ad/c/c;->c()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p0, p2, p3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 85
    :cond_4
    sget-object p2, Lcom/beizi/ad/internal/utilities/UrlUtil;->RAW_Y_DOWN:Ljava/lang/String;

    invoke-virtual {p0, p2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-virtual {p1}, Lcom/beizi/ad/c/c;->d()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_5

    .line 86
    sget-object p2, Lcom/beizi/ad/internal/utilities/UrlUtil;->RAW_Y_DOWN:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/beizi/ad/c/c;->d()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p0, p2, p3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 87
    :cond_5
    sget-object p2, Lcom/beizi/ad/internal/utilities/UrlUtil;->RAW_X_UP:Ljava/lang/String;

    invoke-virtual {p0, p2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-virtual {p1}, Lcom/beizi/ad/c/c;->g()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_6

    .line 88
    sget-object p2, Lcom/beizi/ad/internal/utilities/UrlUtil;->RAW_X_UP:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/beizi/ad/c/c;->g()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p0, p2, p3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 89
    :cond_6
    sget-object p2, Lcom/beizi/ad/internal/utilities/UrlUtil;->RAW_Y_UP:Ljava/lang/String;

    invoke-virtual {p0, p2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_7

    invoke-virtual {p1}, Lcom/beizi/ad/c/c;->h()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_7

    .line 90
    sget-object p2, Lcom/beizi/ad/internal/utilities/UrlUtil;->RAW_Y_UP:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/beizi/ad/c/c;->h()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p0, p2, p3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 91
    :cond_7
    sget-object p2, Lcom/beizi/ad/internal/utilities/UrlUtil;->X_DOWN_DP:Ljava/lang/String;

    invoke-virtual {p0, p2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_8

    invoke-virtual {p1}, Lcom/beizi/ad/c/c;->a()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_8

    .line 92
    sget-object p2, Lcom/beizi/ad/internal/utilities/UrlUtil;->X_DOWN_DP:Ljava/lang/String;

    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object p3

    iget-object p3, p3, Lcom/beizi/ad/internal/g;->i:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/beizi/ad/c/c;->a()Ljava/lang/String;

    move-result-object p4

    invoke-static {p3, p4}, Lcom/beizi/ad/internal/utilities/UrlUtil;->px2dip(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p0, p2, p3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 93
    :cond_8
    sget-object p2, Lcom/beizi/ad/internal/utilities/UrlUtil;->Y_DOWN_DP:Ljava/lang/String;

    invoke-virtual {p0, p2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_9

    invoke-virtual {p1}, Lcom/beizi/ad/c/c;->b()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_9

    .line 94
    sget-object p2, Lcom/beizi/ad/internal/utilities/UrlUtil;->Y_DOWN_DP:Ljava/lang/String;

    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object p3

    iget-object p3, p3, Lcom/beizi/ad/internal/g;->i:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/beizi/ad/c/c;->b()Ljava/lang/String;

    move-result-object p4

    invoke-static {p3, p4}, Lcom/beizi/ad/internal/utilities/UrlUtil;->px2dip(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p0, p2, p3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 95
    :cond_9
    sget-object p2, Lcom/beizi/ad/internal/utilities/UrlUtil;->X_UP_DP:Ljava/lang/String;

    invoke-virtual {p0, p2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_a

    invoke-virtual {p1}, Lcom/beizi/ad/c/c;->e()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_a

    .line 96
    sget-object p2, Lcom/beizi/ad/internal/utilities/UrlUtil;->X_UP_DP:Ljava/lang/String;

    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object p3

    iget-object p3, p3, Lcom/beizi/ad/internal/g;->i:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/beizi/ad/c/c;->e()Ljava/lang/String;

    move-result-object p4

    invoke-static {p3, p4}, Lcom/beizi/ad/internal/utilities/UrlUtil;->px2dip(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p0, p2, p3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 97
    :cond_a
    sget-object p2, Lcom/beizi/ad/internal/utilities/UrlUtil;->Y_UP_DP:Ljava/lang/String;

    invoke-virtual {p0, p2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_b

    invoke-virtual {p1}, Lcom/beizi/ad/c/c;->f()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_b

    .line 98
    sget-object p2, Lcom/beizi/ad/internal/utilities/UrlUtil;->Y_UP_DP:Ljava/lang/String;

    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object p3

    iget-object p3, p3, Lcom/beizi/ad/internal/g;->i:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/beizi/ad/c/c;->f()Ljava/lang/String;

    move-result-object p4

    invoke-static {p3, p4}, Lcom/beizi/ad/internal/utilities/UrlUtil;->px2dip(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p0, p2, p3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 99
    :cond_b
    sget-object p2, Lcom/beizi/ad/internal/utilities/UrlUtil;->RAW_X_DOWN_DP:Ljava/lang/String;

    invoke-virtual {p0, p2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_c

    invoke-virtual {p1}, Lcom/beizi/ad/c/c;->c()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_c

    .line 100
    sget-object p2, Lcom/beizi/ad/internal/utilities/UrlUtil;->RAW_X_DOWN_DP:Ljava/lang/String;

    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object p3

    iget-object p3, p3, Lcom/beizi/ad/internal/g;->i:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/beizi/ad/c/c;->c()Ljava/lang/String;

    move-result-object p4

    invoke-static {p3, p4}, Lcom/beizi/ad/internal/utilities/UrlUtil;->px2dip(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p0, p2, p3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 101
    :cond_c
    sget-object p2, Lcom/beizi/ad/internal/utilities/UrlUtil;->RAW_Y_DOWN_DP:Ljava/lang/String;

    invoke-virtual {p0, p2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_d

    invoke-virtual {p1}, Lcom/beizi/ad/c/c;->d()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_d

    .line 102
    sget-object p2, Lcom/beizi/ad/internal/utilities/UrlUtil;->RAW_Y_DOWN_DP:Ljava/lang/String;

    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object p3

    iget-object p3, p3, Lcom/beizi/ad/internal/g;->i:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/beizi/ad/c/c;->d()Ljava/lang/String;

    move-result-object p4

    invoke-static {p3, p4}, Lcom/beizi/ad/internal/utilities/UrlUtil;->px2dip(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p0, p2, p3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 103
    :cond_d
    sget-object p2, Lcom/beizi/ad/internal/utilities/UrlUtil;->RAW_X_UP_DP:Ljava/lang/String;

    invoke-virtual {p0, p2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_e

    invoke-virtual {p1}, Lcom/beizi/ad/c/c;->g()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_e

    .line 104
    sget-object p2, Lcom/beizi/ad/internal/utilities/UrlUtil;->RAW_X_UP_DP:Ljava/lang/String;

    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object p3

    iget-object p3, p3, Lcom/beizi/ad/internal/g;->i:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/beizi/ad/c/c;->g()Ljava/lang/String;

    move-result-object p4

    invoke-static {p3, p4}, Lcom/beizi/ad/internal/utilities/UrlUtil;->px2dip(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p0, p2, p3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 105
    :cond_e
    sget-object p2, Lcom/beizi/ad/internal/utilities/UrlUtil;->RAW_Y_UP_DP:Ljava/lang/String;

    invoke-virtual {p0, p2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_f

    invoke-virtual {p1}, Lcom/beizi/ad/c/c;->h()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_f

    .line 106
    sget-object p2, Lcom/beizi/ad/internal/utilities/UrlUtil;->RAW_Y_UP_DP:Ljava/lang/String;

    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object p3

    iget-object p3, p3, Lcom/beizi/ad/internal/g;->i:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/beizi/ad/c/c;->h()Ljava/lang/String;

    move-result-object p1

    invoke-static {p3, p1}, Lcom/beizi/ad/internal/utilities/UrlUtil;->px2dip(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p2, p1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    :cond_f
    return-object p0
.end method

.method public static replaceToTouchEventUrl(Ljava/lang/String;Lcom/beizi/ad/c/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
    .locals 2

    .line 107
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_a

    const/4 v0, 0x2

    if-eq p5, v0, :cond_1

    const/4 v0, 0x5

    if-ne p5, v0, :cond_0

    goto :goto_0

    .line 108
    :cond_0
    invoke-static {p0, p1, p2, p3, p4}, Lcom/beizi/ad/internal/utilities/UrlUtil;->replaceToTouchEventUrl(Ljava/lang/String;Lcom/beizi/ad/c/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_1

    .line 109
    :cond_1
    :goto_0
    new-instance p1, Lcom/beizi/ad/c/c;

    invoke-direct {p1}, Lcom/beizi/ad/c/c;-><init>()V

    .line 110
    sget-object v0, Lcom/beizi/ad/internal/utilities/UrlUtil;->CLT_TYPE:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "0"

    .line 111
    invoke-virtual {p1, v0}, Lcom/beizi/ad/c/c;->a(Ljava/lang/String;)V

    .line 112
    invoke-virtual {p1, v0}, Lcom/beizi/ad/c/c;->b(Ljava/lang/String;)V

    .line 113
    invoke-virtual {p1, v0}, Lcom/beizi/ad/c/c;->c(Ljava/lang/String;)V

    .line 114
    invoke-virtual {p1, v0}, Lcom/beizi/ad/c/c;->d(Ljava/lang/String;)V

    .line 115
    invoke-virtual {p1, v0}, Lcom/beizi/ad/c/c;->e(Ljava/lang/String;)V

    .line 116
    invoke-virtual {p1, v0}, Lcom/beizi/ad/c/c;->f(Ljava/lang/String;)V

    .line 117
    invoke-virtual {p1, v0}, Lcom/beizi/ad/c/c;->g(Ljava/lang/String;)V

    .line 118
    invoke-virtual {p1, v0}, Lcom/beizi/ad/c/c;->h(Ljava/lang/String;)V

    .line 119
    invoke-static {p0, p1, p2, p3, p4}, Lcom/beizi/ad/internal/utilities/UrlUtil;->replaceToTouchEventUrl(Ljava/lang/String;Lcom/beizi/ad/c/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 120
    :cond_2
    sget-object v0, Lcom/beizi/ad/internal/utilities/UrlUtil;->CLT_TYPE_999:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "-999"

    .line 121
    invoke-virtual {p1, v0}, Lcom/beizi/ad/c/c;->a(Ljava/lang/String;)V

    .line 122
    invoke-virtual {p1, v0}, Lcom/beizi/ad/c/c;->b(Ljava/lang/String;)V

    .line 123
    invoke-virtual {p1, v0}, Lcom/beizi/ad/c/c;->c(Ljava/lang/String;)V

    .line 124
    invoke-virtual {p1, v0}, Lcom/beizi/ad/c/c;->d(Ljava/lang/String;)V

    .line 125
    invoke-virtual {p1, v0}, Lcom/beizi/ad/c/c;->e(Ljava/lang/String;)V

    .line 126
    invoke-virtual {p1, v0}, Lcom/beizi/ad/c/c;->f(Ljava/lang/String;)V

    .line 127
    invoke-virtual {p1, v0}, Lcom/beizi/ad/c/c;->g(Ljava/lang/String;)V

    .line 128
    invoke-virtual {p1, v0}, Lcom/beizi/ad/c/c;->h(Ljava/lang/String;)V

    .line 129
    invoke-static {p0, p1, p2, p3, p4}, Lcom/beizi/ad/internal/utilities/UrlUtil;->replaceToTouchEventUrl(Ljava/lang/String;Lcom/beizi/ad/c/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 130
    :cond_3
    :goto_1
    sget-object p1, Lcom/beizi/ad/internal/utilities/UrlUtil;->CLT_TYPE:Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 131
    sget-object p1, Lcom/beizi/ad/internal/utilities/UrlUtil;->CLT_TYPE:Ljava/lang/String;

    invoke-static {p5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 132
    :cond_4
    sget-object p1, Lcom/beizi/ad/internal/utilities/UrlUtil;->CLT_TYPE_999:Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 133
    sget-object p1, Lcom/beizi/ad/internal/utilities/UrlUtil;->CLT_TYPE_999:Ljava/lang/String;

    invoke-static {p5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p5

    invoke-virtual {p0, p1, p5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 134
    :cond_5
    sget-object p1, Lcom/beizi/ad/internal/utilities/UrlUtil;->TS:Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 135
    sget-object p1, Lcom/beizi/ad/internal/utilities/UrlUtil;->TS:Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p5

    invoke-virtual {p0, p1, p5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 136
    :cond_6
    sget-object p1, Lcom/beizi/ad/internal/utilities/UrlUtil;->E_TS_S:Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_7

    .line 137
    sget-object p1, Lcom/beizi/ad/internal/utilities/UrlUtil;->E_TS_S:Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 138
    :cond_7
    sget-object p1, Lcom/beizi/ad/internal/utilities/UrlUtil;->E_TS_E:Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_8

    .line 139
    sget-object p1, Lcom/beizi/ad/internal/utilities/UrlUtil;->E_TS_E:Ljava/lang/String;

    invoke-virtual {p0, p1, p3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 140
    :cond_8
    sget-object p1, Lcom/beizi/ad/internal/utilities/UrlUtil;->V_D:Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_9

    .line 141
    sget-object p1, Lcom/beizi/ad/internal/utilities/UrlUtil;->V_D:Ljava/lang/String;

    invoke-virtual {p0, p1, p4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    :cond_9
    return-object p0

    .line 142
    :cond_a
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "url must no null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static replaceToTouchEventUrl(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_c

    .line 2
    sget-object v0, Lcom/beizi/ad/internal/utilities/UrlUtil;->X_DOWN:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    sget-object v0, Lcom/beizi/ad/internal/utilities/UrlUtil;->X_DOWN:Ljava/lang/String;

    invoke-virtual {p0, v0, p1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 4
    :cond_0
    sget-object v0, Lcom/beizi/ad/internal/utilities/UrlUtil;->Y_DOWN:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 5
    sget-object v0, Lcom/beizi/ad/internal/utilities/UrlUtil;->Y_DOWN:Ljava/lang/String;

    invoke-virtual {p0, v0, p2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 6
    :cond_1
    sget-object v0, Lcom/beizi/ad/internal/utilities/UrlUtil;->X_UP:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 7
    sget-object v0, Lcom/beizi/ad/internal/utilities/UrlUtil;->X_UP:Ljava/lang/String;

    invoke-virtual {p0, v0, p1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 8
    :cond_2
    sget-object p1, Lcom/beizi/ad/internal/utilities/UrlUtil;->Y_UP:Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 9
    sget-object p1, Lcom/beizi/ad/internal/utilities/UrlUtil;->Y_UP:Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 10
    :cond_3
    sget-object p1, Lcom/beizi/ad/internal/utilities/UrlUtil;->RAW_X_DOWN:Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 11
    sget-object p1, Lcom/beizi/ad/internal/utilities/UrlUtil;->RAW_X_DOWN:Ljava/lang/String;

    invoke-virtual {p0, p1, p3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 12
    :cond_4
    sget-object p1, Lcom/beizi/ad/internal/utilities/UrlUtil;->RAW_Y_DOWN:Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 13
    sget-object p1, Lcom/beizi/ad/internal/utilities/UrlUtil;->RAW_Y_DOWN:Ljava/lang/String;

    invoke-virtual {p0, p1, p4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 14
    :cond_5
    sget-object p1, Lcom/beizi/ad/internal/utilities/UrlUtil;->RAW_X_UP:Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 15
    sget-object p1, Lcom/beizi/ad/internal/utilities/UrlUtil;->RAW_X_UP:Ljava/lang/String;

    invoke-virtual {p0, p1, p3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 16
    :cond_6
    sget-object p1, Lcom/beizi/ad/internal/utilities/UrlUtil;->RAW_Y_UP:Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_7

    .line 17
    sget-object p1, Lcom/beizi/ad/internal/utilities/UrlUtil;->RAW_Y_UP:Ljava/lang/String;

    invoke-virtual {p0, p1, p4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 18
    :cond_7
    sget-object p1, Lcom/beizi/ad/internal/utilities/UrlUtil;->TS:Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_8

    .line 19
    sget-object p1, Lcom/beizi/ad/internal/utilities/UrlUtil;->TS:Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p2

    invoke-static {p2, p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 20
    :cond_8
    sget-object p1, Lcom/beizi/ad/internal/utilities/UrlUtil;->E_TS_S:Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_9

    .line 21
    sget-object p1, Lcom/beizi/ad/internal/utilities/UrlUtil;->E_TS_S:Ljava/lang/String;

    invoke-virtual {p0, p1, p5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 22
    :cond_9
    sget-object p1, Lcom/beizi/ad/internal/utilities/UrlUtil;->E_TS_E:Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_a

    .line 23
    sget-object p1, Lcom/beizi/ad/internal/utilities/UrlUtil;->E_TS_E:Ljava/lang/String;

    invoke-virtual {p0, p1, p6}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 24
    :cond_a
    sget-object p1, Lcom/beizi/ad/internal/utilities/UrlUtil;->V_D:Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_b

    .line 25
    sget-object p1, Lcom/beizi/ad/internal/utilities/UrlUtil;->V_D:Ljava/lang/String;

    invoke-virtual {p0, p1, p7}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    :cond_b
    return-object p0

    .line 26
    :cond_c
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "url must no null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static replaceToTouchEventUrl(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
    .locals 3

    .line 27
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_18

    const/4 v0, 0x2

    const-string v1, "-999"

    if-ne p8, v0, :cond_1

    .line 28
    sget-object v0, Lcom/beizi/ad/internal/utilities/UrlUtil;->CLT_TYPE:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    const-string v2, "0"

    if-eqz v0, :cond_0

    move-object p1, v2

    move-object p2, p1

    move-object p3, p2

    move-object p4, p3

    .line 29
    :cond_0
    sget-object v0, Lcom/beizi/ad/internal/utilities/UrlUtil;->CLT_TYPE_999:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    move-object p1, v1

    move-object p2, p1

    move-object p3, p2

    move-object p4, p3

    .line 30
    :cond_1
    sget-object v0, Lcom/beizi/ad/internal/utilities/UrlUtil;->X_DOWN:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 31
    sget-object v0, Lcom/beizi/ad/internal/utilities/UrlUtil;->X_DOWN:Ljava/lang/String;

    invoke-virtual {p0, v0, p1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 32
    :cond_2
    sget-object v0, Lcom/beizi/ad/internal/utilities/UrlUtil;->Y_DOWN:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 33
    sget-object v0, Lcom/beizi/ad/internal/utilities/UrlUtil;->Y_DOWN:Ljava/lang/String;

    invoke-virtual {p0, v0, p2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 34
    :cond_3
    sget-object v0, Lcom/beizi/ad/internal/utilities/UrlUtil;->X_UP:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 35
    sget-object v0, Lcom/beizi/ad/internal/utilities/UrlUtil;->X_UP:Ljava/lang/String;

    invoke-virtual {p0, v0, p1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 36
    :cond_4
    sget-object v0, Lcom/beizi/ad/internal/utilities/UrlUtil;->Y_UP:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 37
    sget-object v0, Lcom/beizi/ad/internal/utilities/UrlUtil;->Y_UP:Ljava/lang/String;

    invoke-virtual {p0, v0, p2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 38
    :cond_5
    sget-object v0, Lcom/beizi/ad/internal/utilities/UrlUtil;->RAW_X_DOWN:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 39
    sget-object v0, Lcom/beizi/ad/internal/utilities/UrlUtil;->RAW_X_DOWN:Ljava/lang/String;

    invoke-virtual {p0, v0, p3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 40
    :cond_6
    sget-object v0, Lcom/beizi/ad/internal/utilities/UrlUtil;->RAW_Y_DOWN:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 41
    sget-object v0, Lcom/beizi/ad/internal/utilities/UrlUtil;->RAW_Y_DOWN:Ljava/lang/String;

    invoke-virtual {p0, v0, p4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 42
    :cond_7
    sget-object v0, Lcom/beizi/ad/internal/utilities/UrlUtil;->RAW_X_UP:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 43
    sget-object v0, Lcom/beizi/ad/internal/utilities/UrlUtil;->RAW_X_UP:Ljava/lang/String;

    invoke-virtual {p0, v0, p3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 44
    :cond_8
    sget-object v0, Lcom/beizi/ad/internal/utilities/UrlUtil;->RAW_Y_UP:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 45
    sget-object v0, Lcom/beizi/ad/internal/utilities/UrlUtil;->RAW_Y_UP:Ljava/lang/String;

    invoke-virtual {p0, v0, p4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 46
    :cond_9
    sget-object v0, Lcom/beizi/ad/internal/utilities/UrlUtil;->X_DOWN_DP:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 47
    sget-object v0, Lcom/beizi/ad/internal/utilities/UrlUtil;->X_DOWN_DP:Ljava/lang/String;

    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object v1

    iget-object v1, v1, Lcom/beizi/ad/internal/g;->i:Landroid/content/Context;

    invoke-static {v1, p1}, Lcom/beizi/ad/internal/utilities/UrlUtil;->px2dip(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 48
    :cond_a
    sget-object v0, Lcom/beizi/ad/internal/utilities/UrlUtil;->Y_DOWN_DP:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 49
    sget-object v0, Lcom/beizi/ad/internal/utilities/UrlUtil;->Y_DOWN_DP:Ljava/lang/String;

    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object v1

    iget-object v1, v1, Lcom/beizi/ad/internal/g;->i:Landroid/content/Context;

    invoke-static {v1, p2}, Lcom/beizi/ad/internal/utilities/UrlUtil;->px2dip(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 50
    :cond_b
    sget-object v0, Lcom/beizi/ad/internal/utilities/UrlUtil;->X_UP_DP:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 51
    sget-object v0, Lcom/beizi/ad/internal/utilities/UrlUtil;->X_UP_DP:Ljava/lang/String;

    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object v1

    iget-object v1, v1, Lcom/beizi/ad/internal/g;->i:Landroid/content/Context;

    invoke-static {v1, p1}, Lcom/beizi/ad/internal/utilities/UrlUtil;->px2dip(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 52
    :cond_c
    sget-object p1, Lcom/beizi/ad/internal/utilities/UrlUtil;->Y_UP_DP:Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_d

    .line 53
    sget-object p1, Lcom/beizi/ad/internal/utilities/UrlUtil;->Y_UP_DP:Ljava/lang/String;

    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object v0

    iget-object v0, v0, Lcom/beizi/ad/internal/g;->i:Landroid/content/Context;

    invoke-static {v0, p2}, Lcom/beizi/ad/internal/utilities/UrlUtil;->px2dip(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 54
    :cond_d
    sget-object p1, Lcom/beizi/ad/internal/utilities/UrlUtil;->RAW_X_DOWN_DP:Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_e

    .line 55
    sget-object p1, Lcom/beizi/ad/internal/utilities/UrlUtil;->RAW_X_DOWN_DP:Ljava/lang/String;

    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object p2

    iget-object p2, p2, Lcom/beizi/ad/internal/g;->i:Landroid/content/Context;

    invoke-static {p2, p3}, Lcom/beizi/ad/internal/utilities/UrlUtil;->px2dip(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 56
    :cond_e
    sget-object p1, Lcom/beizi/ad/internal/utilities/UrlUtil;->RAW_Y_DOWN_DP:Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_f

    .line 57
    sget-object p1, Lcom/beizi/ad/internal/utilities/UrlUtil;->RAW_Y_DOWN_DP:Ljava/lang/String;

    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object p2

    iget-object p2, p2, Lcom/beizi/ad/internal/g;->i:Landroid/content/Context;

    invoke-static {p2, p4}, Lcom/beizi/ad/internal/utilities/UrlUtil;->px2dip(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 58
    :cond_f
    sget-object p1, Lcom/beizi/ad/internal/utilities/UrlUtil;->RAW_X_UP_DP:Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_10

    .line 59
    sget-object p1, Lcom/beizi/ad/internal/utilities/UrlUtil;->RAW_X_UP_DP:Ljava/lang/String;

    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object p2

    iget-object p2, p2, Lcom/beizi/ad/internal/g;->i:Landroid/content/Context;

    invoke-static {p2, p3}, Lcom/beizi/ad/internal/utilities/UrlUtil;->px2dip(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 60
    :cond_10
    sget-object p1, Lcom/beizi/ad/internal/utilities/UrlUtil;->RAW_Y_UP_DP:Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_11

    .line 61
    sget-object p1, Lcom/beizi/ad/internal/utilities/UrlUtil;->RAW_Y_UP_DP:Ljava/lang/String;

    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object p2

    iget-object p2, p2, Lcom/beizi/ad/internal/g;->i:Landroid/content/Context;

    invoke-static {p2, p4}, Lcom/beizi/ad/internal/utilities/UrlUtil;->px2dip(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 62
    :cond_11
    sget-object p1, Lcom/beizi/ad/internal/utilities/UrlUtil;->CLT_TYPE:Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_12

    .line 63
    sget-object p1, Lcom/beizi/ad/internal/utilities/UrlUtil;->CLT_TYPE:Ljava/lang/String;

    invoke-static {p8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 64
    :cond_12
    sget-object p1, Lcom/beizi/ad/internal/utilities/UrlUtil;->CLT_TYPE_999:Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_13

    .line 65
    sget-object p1, Lcom/beizi/ad/internal/utilities/UrlUtil;->CLT_TYPE_999:Ljava/lang/String;

    invoke-static {p8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 66
    :cond_13
    sget-object p1, Lcom/beizi/ad/internal/utilities/UrlUtil;->TS:Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_14

    .line 67
    sget-object p1, Lcom/beizi/ad/internal/utilities/UrlUtil;->TS:Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p2

    invoke-static {p2, p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 68
    :cond_14
    sget-object p1, Lcom/beizi/ad/internal/utilities/UrlUtil;->E_TS_S:Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_15

    .line 69
    sget-object p1, Lcom/beizi/ad/internal/utilities/UrlUtil;->E_TS_S:Ljava/lang/String;

    invoke-virtual {p0, p1, p5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 70
    :cond_15
    sget-object p1, Lcom/beizi/ad/internal/utilities/UrlUtil;->E_TS_E:Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_16

    .line 71
    sget-object p1, Lcom/beizi/ad/internal/utilities/UrlUtil;->E_TS_E:Ljava/lang/String;

    invoke-virtual {p0, p1, p6}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 72
    :cond_16
    sget-object p1, Lcom/beizi/ad/internal/utilities/UrlUtil;->V_D:Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_17

    .line 73
    sget-object p1, Lcom/beizi/ad/internal/utilities/UrlUtil;->V_D:Ljava/lang/String;

    invoke-virtual {p0, p1, p7}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    :cond_17
    return-object p0

    .line 74
    :cond_18
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "url must no null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static sendClickInfoToServerWithReplace(Lcom/beizi/ad/c/b$h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lcom/beizi/ad/c/b$h;->b()Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_0

    const-string v5, ""

    const-string v6, ""

    const-string v7, ""

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 3
    invoke-static/range {v0 .. v7}, Lcom/beizi/ad/internal/utilities/UrlUtil;->replaceToTouchEventUrl(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 4
    new-instance p1, Lcom/beizi/ad/internal/h;

    invoke-direct {p1, p0}, Lcom/beizi/ad/internal/h;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/beizi/ad/lance/a/c;->b()Lcom/beizi/ad/lance/a/c;

    move-result-object p0

    invoke-virtual {p0}, Lcom/beizi/ad/lance/a/c;->d()Ljava/util/concurrent/ExecutorService;

    move-result-object p0

    const/4 p2, 0x0

    new-array p2, p2, [Ljava/lang/Void;

    invoke-virtual {p1, p0, p2}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    :cond_0
    return-void
.end method

.method public static sendOnCompletionInfoToServer(Lcom/beizi/ad/c/b$h;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lcom/beizi/ad/c/b$h;->f()Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_0

    const-string v1, ""

    const-string v2, ""

    const-string v3, ""

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, ""

    .line 3
    invoke-static/range {v0 .. v7}, Lcom/beizi/ad/internal/utilities/UrlUtil;->replaceToTouchEventUrl(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 4
    new-instance v0, Lcom/beizi/ad/internal/h;

    invoke-direct {v0, p0}, Lcom/beizi/ad/internal/h;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/beizi/ad/lance/a/c;->b()Lcom/beizi/ad/lance/a/c;

    move-result-object p0

    invoke-virtual {p0}, Lcom/beizi/ad/lance/a/c;->d()Ljava/util/concurrent/ExecutorService;

    move-result-object p0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, p0, v1}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    :cond_0
    return-void
.end method

.method public static sendOnPauseInfoToServer(Lcom/beizi/ad/c/b$h;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lcom/beizi/ad/c/b$h;->e()Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_0

    const-string v1, ""

    const-string v2, ""

    const-string v3, ""

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, ""

    .line 3
    invoke-static/range {v0 .. v7}, Lcom/beizi/ad/internal/utilities/UrlUtil;->replaceToTouchEventUrl(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 4
    new-instance v0, Lcom/beizi/ad/internal/h;

    invoke-direct {v0, p0}, Lcom/beizi/ad/internal/h;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/beizi/ad/lance/a/c;->b()Lcom/beizi/ad/lance/a/c;

    move-result-object p0

    invoke-virtual {p0}, Lcom/beizi/ad/lance/a/c;->d()Ljava/util/concurrent/ExecutorService;

    move-result-object p0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, p0, v1}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    :cond_0
    return-void
.end method

.method public static sendOnStartInfoToServer(Lcom/beizi/ad/c/b$h;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lcom/beizi/ad/c/b$h;->d()Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_0

    const-string v1, ""

    const-string v2, ""

    const-string v3, ""

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, ""

    .line 3
    invoke-static/range {v0 .. v7}, Lcom/beizi/ad/internal/utilities/UrlUtil;->replaceToTouchEventUrl(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 4
    new-instance v0, Lcom/beizi/ad/internal/h;

    invoke-direct {v0, p0}, Lcom/beizi/ad/internal/h;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/beizi/ad/lance/a/c;->b()Lcom/beizi/ad/lance/a/c;

    move-result-object p0

    invoke-virtual {p0}, Lcom/beizi/ad/lance/a/c;->d()Ljava/util/concurrent/ExecutorService;

    move-result-object p0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, p0, v1}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    :cond_0
    return-void
.end method

.method public static sendViewShowInfoToServer(Lcom/beizi/ad/c/b$h;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lcom/beizi/ad/c/b$h;->a()Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_0

    const-string v1, ""

    const-string v2, ""

    const-string v3, ""

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, ""

    .line 3
    invoke-static/range {v0 .. v7}, Lcom/beizi/ad/internal/utilities/UrlUtil;->replaceToTouchEventUrl(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 4
    new-instance v0, Lcom/beizi/ad/internal/h;

    invoke-direct {v0, p0}, Lcom/beizi/ad/internal/h;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/beizi/ad/lance/a/c;->b()Lcom/beizi/ad/lance/a/c;

    move-result-object p0

    invoke-virtual {p0}, Lcom/beizi/ad/lance/a/c;->d()Ljava/util/concurrent/ExecutorService;

    move-result-object p0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, p0, v1}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    :cond_0
    return-void
.end method

.method public static testDNS(Ljava/lang/String;)Z
    .locals 4

    const/4 p0, 0x0

    .line 1
    :try_start_0
    new-instance v0, Lcom/beizi/ad/internal/utilities/UrlUtil$DNSResolver;

    const-string v1, "api.htp.ad-scope.com.cn"

    invoke-direct {v0, v1}, Lcom/beizi/ad/internal/utilities/UrlUtil$DNSResolver;-><init>(Ljava/lang/String;)V

    .line 2
    new-instance v1, Ljava/lang/Thread;

    invoke-direct {v1, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 3
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    const-wide/16 v2, 0x5dc

    .line 4
    invoke-virtual {v1, v2, v3}, Ljava/lang/Thread;->join(J)V

    .line 5
    invoke-virtual {v0}, Lcom/beizi/ad/internal/utilities/UrlUtil$DNSResolver;->get()Ljava/net/InetAddress;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    :catch_0
    :cond_0
    return p0
.end method
