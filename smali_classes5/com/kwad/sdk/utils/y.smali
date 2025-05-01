.class public final Lcom/kwad/sdk/utils/y;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static sAppTag:Ljava/lang/String; = ""


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static MA()I
    .locals 6

    const-string v0, "ksadsdk_perf"

    const-string v1, "image_load_total"

    const/4 v2, 0x0

    .line 1
    invoke-static {v0, v1, v2}, Lcom/kwad/sdk/utils/y;->b(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v3

    .line 2
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "imageLoadTotal:"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v5, "Ks_UnionUtils"

    invoke-static {v5, v4}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    invoke-static {v0, v1, v2}, Lcom/kwad/sdk/utils/y;->a(Ljava/lang/String;Ljava/lang/String;I)V

    return v3
.end method

.method public static MB()I
    .locals 6

    const-string v0, "ksadsdk_perf"

    const-string v1, "image_load_suc"

    const/4 v2, 0x0

    .line 1
    invoke-static {v0, v1, v2}, Lcom/kwad/sdk/utils/y;->b(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v3

    .line 2
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "imageLoadSuccess:"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v5, "Ks_UnionUtils"

    invoke-static {v5, v4}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    invoke-static {v0, v1, v2}, Lcom/kwad/sdk/utils/y;->a(Ljava/lang/String;Ljava/lang/String;I)V

    return v3
.end method

.method public static MC()I
    .locals 6

    const-string v0, "ksadsdk_perf"

    const-string v1, "image_load_failed"

    const/4 v2, 0x0

    .line 1
    invoke-static {v0, v1, v2}, Lcom/kwad/sdk/utils/y;->b(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v3

    .line 2
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "imageLoadFailed:"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v5, "Ks_UnionUtils"

    invoke-static {v5, v4}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    invoke-static {v0, v1, v2}, Lcom/kwad/sdk/utils/y;->a(Ljava/lang/String;Ljava/lang/String;I)V

    return v3
.end method

.method public static Mm()Ljava/lang/String;
    .locals 4

    .line 1
    invoke-static {}, Lcom/kwad/sdk/utils/y;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, ""

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    const-string v2, "ksadsdk_interstitial_daily_show_count"

    const-string v3, "KEY_INTERSTITIAL_DAILY_SHOW_COUNT"

    .line 2
    invoke-static {v0, v2, v3, v1}, Lcom/kwad/sdk/utils/y;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static Mn()Ljava/lang/String;
    .locals 4

    .line 1
    invoke-static {}, Lcom/kwad/sdk/utils/y;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, ""

    if-nez v0, :cond_0

    return-object v1

    .line 2
    :cond_0
    invoke-static {}, Lcom/kwad/sdk/utils/bf;->NB()Z

    move-result v2

    const-string v3, "KEY_INTERSTITIAL_AGGREGATE_DAILY_SHOW_COUNT"

    if-eqz v2, :cond_1

    const-string v2, "ksadsdk_interstitial_daily_show_count"

    .line 3
    invoke-static {v0, v2, v3, v1}, Lcom/kwad/sdk/utils/y;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    const-string v2, "ksadsdk_interstitial_aggregate_daily_show_count"

    .line 4
    invoke-static {v0, v2, v3, v1}, Lcom/kwad/sdk/utils/y;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public static Mo()Ljava/lang/String;
    .locals 4

    .line 1
    invoke-static {}, Lcom/kwad/sdk/utils/y;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, ""

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    const-string v2, "ksadsdk_reward_full_ad_jump_direct"

    const-string v3, "KEY_REWARD_FULL_AD_JUMP_DIRECT"

    .line 2
    invoke-static {v0, v2, v3, v1}, Lcom/kwad/sdk/utils/y;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static Mp()Ljava/lang/String;
    .locals 4

    .line 1
    invoke-static {}, Lcom/kwad/sdk/utils/y;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, ""

    if-nez v0, :cond_0

    return-object v1

    .line 2
    :cond_0
    invoke-static {}, Lcom/kwad/sdk/utils/bf;->Nx()Z

    move-result v2

    const-string v3, "KEY_SPLASH_DAILY_SHOW_COUNT"

    if-eqz v2, :cond_1

    const-string v2, "ksadsdk_splash_local_ad_force_active"

    .line 3
    invoke-static {v0, v2, v3, v1}, Lcom/kwad/sdk/utils/y;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    const-string v2, "ksadsdk_splash_daily_show_count"

    .line 4
    invoke-static {v0, v2, v3, v1}, Lcom/kwad/sdk/utils/y;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public static Mq()Ljava/lang/String;
    .locals 4

    .line 1
    invoke-static {}, Lcom/kwad/sdk/utils/y;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, ""

    if-nez v0, :cond_0

    return-object v1

    .line 2
    :cond_0
    invoke-static {}, Lcom/kwad/sdk/utils/bf;->Nz()Z

    move-result v2

    const-string v3, "KEY_REWARD_AUTO_CALL_APP_CARD_SHOW_COUNT"

    if-eqz v2, :cond_1

    const-string v0, "ksadsdk_reward_full_ad_jump_direct"

    .line 3
    invoke-static {v0, v3, v1}, Lcom/kwad/sdk/utils/y;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    const-string v2, "ksadsdk_reward_auto_call_app_card_show_count"

    .line 4
    invoke-static {v0, v2, v3, v1}, Lcom/kwad/sdk/utils/y;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public static Mr()Ljava/lang/String;
    .locals 3

    const-string v0, "ksadsdk_interstitial_daily_show_count"

    const-string v1, "KEY_INTERSTITIAL_AUTO_CALL_APP_CARD_SHOW_COUNT"

    const-string v2, ""

    .line 1
    invoke-static {v0, v1, v2}, Lcom/kwad/sdk/utils/y;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static Ms()Ljava/lang/String;
    .locals 4

    .line 1
    sget-object v0, Lcom/kwad/sdk/utils/y;->sAppTag:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    sget-object v0, Lcom/kwad/sdk/utils/y;->sAppTag:Ljava/lang/String;

    return-object v0

    .line 3
    :cond_0
    invoke-static {}, Lcom/kwad/sdk/utils/y;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, ""

    if-nez v0, :cond_1

    return-object v1

    :cond_1
    const-string v2, "ksadsdk_pref"

    const-string v3, "appTag"

    .line 4
    invoke-static {v0, v2, v3, v1}, Lcom/kwad/sdk/utils/y;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static Mt()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/sdk/utils/y;->getContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, ""

    return-object v0

    .line 2
    :cond_0
    invoke-static {v0}, Lcom/kwad/sdk/utils/y;->cl(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static Mu()J
    .locals 4

    const-string v0, "ksadsdk_push_ad_common"

    const-string v1, "key_push_last_show_time"

    const-wide/16 v2, -0x1

    .line 1
    invoke-static {v0, v1, v2, v3}, Lcom/kwad/sdk/utils/y;->b(Ljava/lang/String;Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static Mv()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-static {}, Lcom/kwad/sdk/utils/y;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, ""

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    const-string v0, "ksadsdk_install_tips_show_count"

    const-string v2, "init_install_tips_show_count"

    .line 2
    invoke-static {v0, v2, v1}, Lcom/kwad/sdk/utils/y;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static Mw()V
    .locals 3

    const-string v0, "ksadsdk_perf"

    const-string v1, "image_load_total"

    const/4 v2, 0x0

    .line 1
    invoke-static {v0, v1, v2}, Lcom/kwad/sdk/utils/y;->b(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    .line 2
    invoke-static {v0, v1, v2}, Lcom/kwad/sdk/utils/y;->a(Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

.method public static Mx()V
    .locals 3

    const-string v0, "ksadsdk_perf"

    const-string v1, "image_load_suc"

    const/4 v2, 0x0

    .line 1
    invoke-static {v0, v1, v2}, Lcom/kwad/sdk/utils/y;->b(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    .line 2
    invoke-static {v0, v1, v2}, Lcom/kwad/sdk/utils/y;->a(Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

.method public static My()V
    .locals 3

    const-string v0, "ksadsdk_perf"

    const-string v1, "image_load_failed"

    const/4 v2, 0x0

    .line 1
    invoke-static {v0, v1, v2}, Lcom/kwad/sdk/utils/y;->b(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    .line 2
    invoke-static {v0, v1, v2}, Lcom/kwad/sdk/utils/y;->a(Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

.method public static Mz()D
    .locals 9

    const-string v0, "ksadsdk_perf"

    const-string v1, "image_load_complete_count"

    const/4 v2, 0x0

    .line 1
    invoke-static {v0, v1, v2}, Lcom/kwad/sdk/utils/y;->b(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v3

    const-string v4, "image_load_complete_total"

    const-wide/16 v5, 0x0

    .line 2
    invoke-static {v0, v4, v5, v6}, Lcom/kwad/sdk/utils/y;->b(Ljava/lang/String;Ljava/lang/String;J)J

    move-result-wide v7

    .line 3
    invoke-static {v0, v1, v2}, Lcom/kwad/sdk/utils/y;->a(Ljava/lang/String;Ljava/lang/String;I)V

    .line 4
    invoke-static {v0, v4, v5, v6}, Lcom/kwad/sdk/utils/y;->a(Ljava/lang/String;Ljava/lang/String;J)V

    if-nez v3, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    :cond_0
    long-to-double v0, v7

    int-to-double v2, v3

    .line 5
    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v0, v2

    return-wide v0
.end method

.method public static U(Landroid/content/Context;Ljava/lang/String;)J
    .locals 3

    const-wide/16 v0, 0x0

    if-nez p0, :cond_0

    return-wide v0

    :cond_0
    const-string v2, "ksadsdk_pref"

    .line 1
    invoke-static {p0, v2, p1, v0, v1}, Lcom/kwad/sdk/utils/y;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static V(Landroid/content/Context;Ljava/lang/String;)J
    .locals 3

    const-wide/16 v0, 0x0

    if-nez p0, :cond_0

    return-wide v0

    :cond_0
    const-string v2, "ksadsdk_download_package_length"

    .line 1
    invoke-static {p0, v2, p1, v0, v1}, Lcom/kwad/sdk/utils/y;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static W(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, ""

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    const-string v1, "ksadsdk_download_package_md5"

    .line 1
    invoke-static {p0, v1, p1, v0}, Lcom/kwad/sdk/utils/y;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static X(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    if-nez p0, :cond_0

    return-void

    :cond_0
    const-string v0, "ksadsdk_egid"

    const-string v1, "KEY_SDK_EGID"

    .line 1
    invoke-static {p0, v0, v1, p1}, Lcom/kwad/sdk/utils/y;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static Y(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    if-nez p0, :cond_0

    return-void

    :cond_0
    const/4 p0, 0x1

    const-string v0, "ksadsdk_model"

    const-string v1, "KEY_SDK_MODEL"

    .line 1
    invoke-static {v0, v1, p1, p0}, Lcom/kwad/sdk/utils/y;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method public static Z(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    if-nez p0, :cond_0

    return-void

    :cond_0
    const-string v0, "ksadsdk_interstitial_daily_show_count"

    const-string v1, "KEY_INTERSTITIAL_DAILY_SHOW_COUNT"

    .line 1
    invoke-static {p0, v0, v1, p1}, Lcom/kwad/sdk/utils/y;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 1

    if-nez p0, :cond_0

    return-void

    .line 26
    :cond_0
    invoke-static {}, Lcom/kwad/sdk/utils/x;->Mf()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 27
    invoke-static {p1, p2, p3}, Lcom/kwad/sdk/utils/bg;->a(Ljava/lang/String;Ljava/lang/String;I)V

    return-void

    .line 28
    :cond_1
    invoke-static {p0, p1}, Lcom/kwad/sdk/utils/a/e;->av(Landroid/content/Context;Ljava/lang/String;)Lcom/kwad/sdk/utils/a/c;

    move-result-object p0

    invoke-virtual {p0, p2, p3}, Lcom/kwad/sdk/utils/a/c;->putInt(Ljava/lang/String;I)V

    return-void
.end method

.method private static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 1

    if-nez p0, :cond_0

    return-void

    .line 23
    :cond_0
    invoke-static {}, Lcom/kwad/sdk/utils/x;->Mf()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 24
    invoke-static {p1, p2, p3, p4}, Lcom/kwad/sdk/utils/bg;->a(Ljava/lang/String;Ljava/lang/String;J)V

    return-void

    .line 25
    :cond_1
    invoke-static {p0, p1}, Lcom/kwad/sdk/utils/a/e;->av(Landroid/content/Context;Ljava/lang/String;)Lcom/kwad/sdk/utils/a/c;

    move-result-object p0

    invoke-virtual {p0, p2, p3, p4}, Lcom/kwad/sdk/utils/a/c;->putLong(Ljava/lang/String;J)V

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    if-nez p0, :cond_0

    return-void

    .line 7
    :cond_0
    invoke-static {}, Lcom/kwad/sdk/utils/x;->Mf()Z

    move-result v0

    const-string v1, " value:"

    const-string v2, "Ks_UnionUtils"

    if-eqz v0, :cond_1

    .line 8
    invoke-static {p1, p2, p3}, Lcom/kwad/sdk/utils/bg;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    sget-object p0, Lcom/kwad/framework/a/a;->md:Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_3

    .line 10
    new-instance p0, Ljava/lang/StringBuilder;

    const-string p1, "putString Sp key:"

    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v2, p0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 11
    :cond_1
    invoke-static {p0, p1}, Lcom/kwad/sdk/utils/a/e;->av(Landroid/content/Context;Ljava/lang/String;)Lcom/kwad/sdk/utils/a/c;

    move-result-object p0

    invoke-virtual {p0, p2, p3}, Lcom/kwad/sdk/utils/a/c;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    sget-object p0, Lcom/kwad/framework/a/a;->md:Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_2

    .line 13
    new-instance p0, Ljava/lang/StringBuilder;

    const-string p1, "putString key:"

    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v2, p0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    :cond_2
    invoke-static {p2, p3}, Lcom/kwad/sdk/utils/x;->ar(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    return-void
.end method

.method private static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    if-nez p0, :cond_0

    return-void

    .line 15
    :cond_0
    invoke-static {}, Lcom/kwad/sdk/utils/x;->Mf()Z

    move-result v0

    const-string v1, " value:"

    const-string v2, "Ks_UnionUtils"

    if-eqz v0, :cond_1

    .line 16
    invoke-static {p1, p2, p3, p4}, Lcom/kwad/sdk/utils/bg;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 17
    sget-object p0, Lcom/kwad/framework/a/a;->md:Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_3

    .line 18
    new-instance p0, Ljava/lang/StringBuilder;

    const-string p1, "putString Sp key:"

    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v2, p0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 19
    :cond_1
    invoke-static {p0, p1}, Lcom/kwad/sdk/utils/a/e;->av(Landroid/content/Context;Ljava/lang/String;)Lcom/kwad/sdk/utils/a/c;

    move-result-object p0

    invoke-virtual {p0, p2, p3}, Lcom/kwad/sdk/utils/a/c;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    sget-object p0, Lcom/kwad/framework/a/a;->md:Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_2

    .line 21
    new-instance p0, Ljava/lang/StringBuilder;

    const-string p1, "putString key:"

    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v2, p0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    :cond_2
    invoke-static {p2, p3}, Lcom/kwad/sdk/utils/x;->ar(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 1

    .line 5
    invoke-static {}, Lcom/kwad/sdk/utils/y;->getContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 6
    :cond_0
    invoke-static {v0, p0, p1, p2}, Lcom/kwad/sdk/utils/y;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

.method private static a(Ljava/lang/String;Ljava/lang/String;J)V
    .locals 1

    .line 3
    invoke-static {}, Lcom/kwad/sdk/utils/y;->getContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 4
    :cond_0
    invoke-static {v0, p0, p1, p2, p3}, Lcom/kwad/sdk/utils/y;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;J)V

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/sdk/utils/y;->getContext()Landroid/content/Context;

    move-result-object p3

    if-nez p3, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 2
    invoke-static {p3, p0, p1, p2, v0}, Lcom/kwad/sdk/utils/y;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method public static aM(J)V
    .locals 2

    const-string v0, "ksadsdk_push_ad_common"

    const-string v1, "key_push_last_show_time"

    .line 1
    invoke-static {v0, v1, p0, p1}, Lcom/kwad/sdk/utils/y;->a(Ljava/lang/String;Ljava/lang/String;J)V

    return-void
.end method

.method public static aN(J)V
    .locals 4

    const-string v0, "ksadsdk_perf"

    const-string v1, "image_load_complete_count"

    const/4 v2, 0x0

    .line 1
    invoke-static {v0, v1, v2}, Lcom/kwad/sdk/utils/y;->b(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    .line 2
    invoke-static {v0, v1, v2}, Lcom/kwad/sdk/utils/y;->a(Ljava/lang/String;Ljava/lang/String;I)V

    const-string v1, "image_load_complete_total"

    const-wide/16 v2, 0x0

    .line 3
    invoke-static {v0, v1, v2, v3}, Lcom/kwad/sdk/utils/y;->b(Ljava/lang/String;Ljava/lang/String;J)J

    move-result-wide v2

    add-long/2addr v2, p0

    .line 4
    invoke-static {v0, v1, v2, v3}, Lcom/kwad/sdk/utils/y;->a(Ljava/lang/String;Ljava/lang/String;J)V

    return-void
.end method

.method public static aa(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    if-nez p0, :cond_0

    return-void

    :cond_0
    const-string v0, "ksadsdk_interstitial_daily_show_count"

    const-string v1, "KEY_INTERSTITIAL_AGGREGATE_DAILY_SHOW_COUNT"

    .line 1
    invoke-static {p0, v0, v1, p1}, Lcom/kwad/sdk/utils/y;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    invoke-static {}, Lcom/kwad/sdk/utils/bf;->NA()V

    return-void
.end method

.method public static ab(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    if-nez p0, :cond_0

    return-void

    :cond_0
    const-string v0, "ksadsdk_reward_full_ad_jump_direct"

    const-string v1, "KEY_REWARD_INTERACT_AD_SHOW_INFO"

    .line 1
    invoke-static {p0, v0, v1, p1}, Lcom/kwad/sdk/utils/y;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static ac(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    if-nez p0, :cond_0

    return-void

    :cond_0
    const-string v0, "ksadsdk_reward_full_ad_jump_direct"

    const-string v1, "KEY_REWARD_FULL_AD_JUMP_DIRECT"

    .line 1
    invoke-static {p0, v0, v1, p1}, Lcom/kwad/sdk/utils/y;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static ad(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    if-nez p0, :cond_0

    return-void

    :cond_0
    const-string v0, "ksadsdk_splash_local_ad_force_active"

    const-string v1, "KEY_SPLASH_DAILY_SHOW_COUNT"

    .line 1
    invoke-static {p0, v0, v1, p1}, Lcom/kwad/sdk/utils/y;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    invoke-static {}, Lcom/kwad/sdk/utils/bf;->Nw()V

    return-void
.end method

.method public static ae(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    if-nez p0, :cond_0

    return-void

    :cond_0
    const-string v0, "ksadsdk_reward_full_ad_jump_direct"

    const-string v1, "KEY_REWARD_AUTO_CALL_APP_CARD_SHOW_COUNT"

    .line 1
    invoke-static {p0, v0, v1, p1}, Lcom/kwad/sdk/utils/y;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    invoke-static {}, Lcom/kwad/sdk/utils/bf;->Ny()V

    return-void
.end method

.method public static af(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    if-nez p0, :cond_0

    return-void

    :cond_0
    const-string v0, "ksadsdk_interstitial_daily_show_count"

    const-string v1, "KEY_INTERSTITIAL_AUTO_CALL_APP_CARD_SHOW_COUNT"

    .line 1
    invoke-static {p0, v0, v1, p1}, Lcom/kwad/sdk/utils/y;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static ag(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    if-nez p0, :cond_0

    return-void

    :cond_0
    const-string v0, "ksadsdk_device_sig"

    const-string v1, "KEY_SDK_DEVICE_SIG"

    .line 1
    invoke-static {p0, v0, v1, p1}, Lcom/kwad/sdk/utils/y;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static ah(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    if-eqz p0, :cond_1

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    new-instance p0, Lcom/kwad/sdk/utils/y$1;

    invoke-direct {p0, p1}, Lcom/kwad/sdk/utils/y$1;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Lcom/kwad/sdk/utils/g;->execute(Ljava/lang/Runnable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static ai(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    if-nez p0, :cond_0

    return-void

    :cond_0
    const-string v0, "ksadsdk_pref"

    const-string v1, "appTag"

    .line 1
    invoke-static {p0, v0, v1, p1}, Lcom/kwad/sdk/utils/y;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static aj(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    if-nez p0, :cond_0

    return-void

    :cond_0
    const/4 p0, 0x1

    const-string v0, "ksadsdk_pref"

    const-string v1, "webview_ua"

    .line 1
    invoke-static {v0, v1, p1, p0}, Lcom/kwad/sdk/utils/y;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method public static ak(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    if-nez p0, :cond_0

    return-void

    .line 1
    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 2
    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    const-string v0, "ksadsdk_sdk_config_data"

    invoke-static {p0, v0, p1}, Lcom/kwad/sdk/utils/bf;->j(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static al(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    if-nez p0, :cond_0

    return-void

    :cond_0
    const-string p0, "ksadsdk_install_tips_show_count"

    const-string v0, "init_install_tips_show_count"

    .line 1
    invoke-static {p0, v0, p1}, Lcom/kwad/sdk/utils/y;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private static b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)I
    .locals 1

    if-nez p0, :cond_0

    return p3

    .line 19
    :cond_0
    invoke-static {}, Lcom/kwad/sdk/utils/x;->Mf()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 20
    invoke-static {p1, p2, p3}, Lcom/kwad/sdk/utils/bg;->b(Ljava/lang/String;Ljava/lang/String;I)I

    move-result p0

    goto :goto_0

    .line 21
    :cond_1
    invoke-static {p0, p1}, Lcom/kwad/sdk/utils/a/e;->av(Landroid/content/Context;Ljava/lang/String;)Lcom/kwad/sdk/utils/a/c;

    move-result-object p0

    invoke-virtual {p0, p2, p3}, Lcom/kwad/sdk/utils/a/c;->getInt(Ljava/lang/String;I)I

    move-result p0

    :goto_0
    return p0
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;I)I
    .locals 1

    .line 3
    invoke-static {}, Lcom/kwad/sdk/utils/y;->getContext()Landroid/content/Context;

    move-result-object p2

    const/4 v0, 0x0

    if-nez p2, :cond_0

    return v0

    .line 4
    :cond_0
    invoke-static {p2, p0, p1, v0}, Lcom/kwad/sdk/utils/y;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)I

    move-result p0

    return p0
.end method

.method private static b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;J)J
    .locals 1

    if-nez p0, :cond_0

    return-wide p3

    .line 16
    :cond_0
    invoke-static {}, Lcom/kwad/sdk/utils/x;->Mf()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 17
    invoke-static {p1, p2, p3, p4}, Lcom/kwad/sdk/utils/bg;->b(Ljava/lang/String;Ljava/lang/String;J)J

    move-result-wide p0

    return-wide p0

    .line 18
    :cond_1
    invoke-static {p0, p1}, Lcom/kwad/sdk/utils/a/e;->av(Landroid/content/Context;Ljava/lang/String;)Lcom/kwad/sdk/utils/a/c;

    move-result-object p0

    invoke-virtual {p0, p2, p3, p4}, Lcom/kwad/sdk/utils/a/c;->getLong(Ljava/lang/String;J)J

    move-result-wide p0

    return-wide p0
.end method

.method private static b(Ljava/lang/String;Ljava/lang/String;J)J
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/sdk/utils/y;->getContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    return-wide p2

    .line 2
    :cond_0
    invoke-static {v0, p0, p1, p2, p3}, Lcom/kwad/sdk/utils/y;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    if-nez p0, :cond_0

    return-object p3

    .line 5
    :cond_0
    invoke-static {}, Lcom/kwad/sdk/utils/x;->Mf()Z

    move-result v0

    const-string v1, " value:"

    const-string v2, "Ks_UnionUtils"

    if-eqz v0, :cond_1

    .line 6
    invoke-static {p1, p2, p3}, Lcom/kwad/sdk/utils/bg;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 7
    sget-object p1, Lcom/kwad/framework/a/a;->md:Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 8
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p3, "getString From Sp key:"

    invoke-direct {p1, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 9
    :cond_1
    invoke-static {p0, p1}, Lcom/kwad/sdk/utils/a/e;->av(Landroid/content/Context;Ljava/lang/String;)Lcom/kwad/sdk/utils/a/c;

    .line 10
    invoke-static {p0, p1}, Lcom/kwad/sdk/utils/a/e;->av(Landroid/content/Context;Ljava/lang/String;)Lcom/kwad/sdk/utils/a/c;

    move-result-object p0

    invoke-virtual {p0, p2, p3}, Lcom/kwad/sdk/utils/a/c;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 11
    invoke-static {p2, p0}, Lcom/kwad/sdk/utils/x;->as(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    sget-object p1, Lcom/kwad/framework/a/a;->md:Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 13
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p3, "getString key:"

    invoke-direct {p1, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    :cond_2
    :goto_0
    invoke-static {p0}, Lcom/kwad/sdk/core/a/c;->dT(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 15
    invoke-static {p0}, Lcom/kwad/sdk/core/a/c;->dS(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    :cond_3
    return-object p0
.end method

.method private static b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    if-nez p0, :cond_0

    return-void

    .line 22
    :cond_0
    invoke-static {}, Lcom/kwad/sdk/utils/x;->Mf()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 23
    invoke-static {p1, p2, p3}, Lcom/kwad/sdk/utils/bg;->l(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void

    .line 24
    :cond_1
    invoke-static {p0, p1}, Lcom/kwad/sdk/utils/a/e;->av(Landroid/content/Context;Ljava/lang/String;)Lcom/kwad/sdk/utils/a/c;

    move-result-object p0

    invoke-virtual {p0, p2, p3}, Lcom/kwad/sdk/utils/a/c;->putBoolean(Ljava/lang/String;Z)V

    return-void
.end method

.method private static c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)Z
    .locals 1

    if-nez p0, :cond_0

    return p3

    .line 1
    :cond_0
    invoke-static {}, Lcom/kwad/sdk/utils/x;->Mf()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    invoke-static {p1, p2, p3}, Lcom/kwad/sdk/utils/bg;->m(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p0

    return p0

    .line 3
    :cond_1
    invoke-static {p0, p1}, Lcom/kwad/sdk/utils/a/e;->av(Landroid/content/Context;Ljava/lang/String;)Lcom/kwad/sdk/utils/a/c;

    move-result-object p0

    invoke-virtual {p0, p2, p3}, Lcom/kwad/sdk/utils/a/c;->getBoolean(Ljava/lang/String;Z)Z

    move-result p0

    return p0
.end method

.method public static cl(Landroid/content/Context;)Ljava/lang/String;
    .locals 3
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, ""

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    const-string v1, "ksadsdk_egid"

    const-string v2, "KEY_SDK_EGID"

    .line 1
    invoke-static {p0, v1, v2, v0}, Lcom/kwad/sdk/utils/y;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static cm(Landroid/content/Context;)J
    .locals 4
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const-wide/16 v0, 0x0

    if-nez p0, :cond_0

    return-wide v0

    :cond_0
    const-string v2, "ksadsdk_gidExpireTimeMs"

    const-string v3, "KEY_SDK_EGID"

    .line 1
    invoke-static {p0, v2, v3, v0, v1}, Lcom/kwad/sdk/utils/y;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static cn(Landroid/content/Context;)I
    .locals 3
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    const-string v1, "ksadsdk_config_request"

    const-string v2, "KEY_CONFIG_REQUEST_FAIL"

    .line 1
    invoke-static {p0, v1, v2, v0}, Lcom/kwad/sdk/utils/y;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)I

    move-result p0

    return p0
.end method

.method public static co(Landroid/content/Context;)Ljava/lang/String;
    .locals 3
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, ""

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    const-string v1, "ksadsdk_model"

    const-string v2, "KEY_SDK_MODEL"

    .line 1
    invoke-static {p0, v1, v2, v0}, Lcom/kwad/sdk/utils/y;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 2
    invoke-static {p0, v1, v2}, Lcom/kwad/sdk/utils/bg;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public static cp(Landroid/content/Context;)I
    .locals 3
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    const-string v1, "ksadsdk_reward_full_ad_jump_direct"

    const-string v2, "KEY_REWARD_AD_SHOW_INTERACT_INTERVAL_SHOW_COUNT"

    .line 1
    invoke-static {p0, v1, v2, v0}, Lcom/kwad/sdk/utils/y;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)I

    move-result p0

    return p0
.end method

.method public static cq(Landroid/content/Context;)Ljava/lang/String;
    .locals 3
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, ""

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    const-string v1, "ksadsdk_reward_full_ad_jump_direct"

    const-string v2, "KEY_REWARD_INTERACT_AD_SHOW_INFO"

    .line 1
    invoke-static {p0, v1, v2, v0}, Lcom/kwad/sdk/utils/y;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static cr(Landroid/content/Context;)Ljava/lang/String;
    .locals 3
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, ""

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    const-string v1, "ksadsdk_device_sig"

    const-string v2, "KEY_SDK_DEVICE_SIG"

    .line 1
    invoke-static {p0, v1, v2, v0}, Lcom/kwad/sdk/utils/y;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static cs(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    const-string v0, ""

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    const-string p0, "ksadsdk_pref"

    const-string v1, "webview_ua"

    .line 1
    invoke-static {p0, v1, v0}, Lcom/kwad/sdk/utils/y;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-static {v0, p0, v1}, Lcom/kwad/sdk/utils/bg;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static ct(Landroid/content/Context;)Ljava/lang/String;
    .locals 3
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .line 1
    invoke-static {}, Lcom/kwad/sdk/utils/bf;->Nu()Z

    move-result v0

    const-string v1, "ksadsdk_sdk_config_data"

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0, v1}, Lcom/kwad/sdk/utils/bf;->au(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    const-string v0, "config_str"

    const-string v2, ""

    .line 3
    invoke-static {v1, v0, v2}, Lcom/kwad/sdk/utils/bg;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 4
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0, v1, v0}, Lcom/kwad/sdk/utils/bf;->i(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    move-object p0, v0

    :goto_0
    return-object p0
.end method

.method public static d(Landroid/content/Context;J)V
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    if-nez p0, :cond_0

    return-void

    :cond_0
    const-string v0, "ksadsdk_gidExpireTimeMs"

    const-string v1, "KEY_SDK_EGID"

    .line 1
    invoke-static {p0, v0, v1, p1, p2}, Lcom/kwad/sdk/utils/y;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;J)V

    return-void
.end method

.method public static e(Landroid/content/Context;Ljava/lang/String;J)V
    .locals 1

    if-nez p0, :cond_0

    return-void

    :cond_0
    const-string v0, "ksadsdk_pref"

    .line 1
    invoke-static {p0, v0, p1, p2, p3}, Lcom/kwad/sdk/utils/y;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;J)V

    return-void
.end method

.method public static f(Landroid/content/Context;Ljava/lang/String;J)V
    .locals 1

    if-nez p0, :cond_0

    return-void

    :cond_0
    const-string v0, "ksadsdk_download_package_length"

    .line 1
    invoke-static {p0, v0, p1, p2, p3}, Lcom/kwad/sdk/utils/y;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;J)V

    return-void
.end method

.method public static g(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    if-nez p0, :cond_0

    return-void

    :cond_0
    const-string v0, "ksadsdk_download_package_md5"

    .line 1
    invoke-static {p0, v0, p1, p2}, Lcom/kwad/sdk/utils/y;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 2
    invoke-static {}, Lcom/kwad/sdk/utils/y;->getContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 3
    :cond_0
    invoke-static {v0, p0, p1, p2}, Lcom/kwad/sdk/utils/y;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static getContext()Landroid/content/Context;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    invoke-static {}, Lcom/kwad/sdk/service/ServiceProvider;->Lw()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public static h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/sdk/utils/y;->getContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    return-object p2

    .line 2
    :cond_0
    invoke-static {v0, p0, p1, p2}, Lcom/kwad/sdk/utils/y;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static h(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    if-nez p0, :cond_0

    return-void

    .line 3
    :cond_0
    invoke-static {}, Lcom/kwad/sdk/utils/x;->Mf()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    invoke-static {p1, p2}, Lcom/kwad/sdk/utils/bg;->aw(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 5
    :cond_1
    invoke-static {p0, p1}, Lcom/kwad/sdk/utils/a/e;->av(Landroid/content/Context;Ljava/lang/String;)Lcom/kwad/sdk/utils/a/c;

    move-result-object p0

    invoke-virtual {p0, p2}, Lcom/kwad/sdk/utils/a/c;->remove(Ljava/lang/String;)V

    const-string p0, ""

    .line 6
    invoke-static {p2, p0}, Lcom/kwad/sdk/utils/x;->ar(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/sdk/utils/x;->Mf()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-static {p0, p1, p2}, Lcom/kwad/sdk/utils/bg;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static l(Landroid/content/Context;I)V
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    if-nez p0, :cond_0

    return-void

    :cond_0
    const-string v0, "ksadsdk_config_request"

    const-string v1, "KEY_CONFIG_REQUEST_FAIL"

    .line 1
    invoke-static {p0, v0, v1, p1}, Lcom/kwad/sdk/utils/y;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

.method public static l(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    .line 2
    invoke-static {}, Lcom/kwad/sdk/utils/y;->getContext()Landroid/content/Context;

    move-result-object p2

    if-nez p2, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 3
    invoke-static {p2, p0, p1, v0}, Lcom/kwad/sdk/utils/y;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method public static m(Landroid/content/Context;I)V
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    if-nez p0, :cond_0

    return-void

    :cond_0
    const-string v0, "ksadsdk_reward_full_ad_jump_direct"

    const-string v1, "KEY_REWARD_AD_SHOW_INTERACT_INTERVAL_SHOW_COUNT"

    .line 1
    invoke-static {p0, v0, v1, p1}, Lcom/kwad/sdk/utils/y;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

.method public static m(Ljava/lang/String;Ljava/lang/String;Z)Z
    .locals 1

    .line 2
    invoke-static {}, Lcom/kwad/sdk/utils/y;->getContext()Landroid/content/Context;

    move-result-object p2

    const/4 v0, 0x0

    if-nez p2, :cond_0

    return v0

    .line 3
    :cond_0
    invoke-static {p2, p0, p1, v0}, Lcom/kwad/sdk/utils/y;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p0

    return p0
.end method
