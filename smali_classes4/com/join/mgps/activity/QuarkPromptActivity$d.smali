.class Lcom/join/mgps/activity/QuarkPromptActivity$d;
.super Ljava/lang/Object;
.source "QuarkPromptActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/QuarkPromptActivity;->j0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/activity/QuarkPromptActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/QuarkPromptActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/QuarkPromptActivity$d;->b:Lcom/join/mgps/activity/QuarkPromptActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkPromptActivity$d;->b:Lcom/join/mgps/activity/QuarkPromptActivity;

    iget-object v0, v0, Lcom/join/mgps/activity/QuarkPromptActivity;->k:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->quark_display_count()Lorg/androidannotations/api/sharedpreferences/i;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 2
    iget-object v1, p0, Lcom/join/mgps/activity/QuarkPromptActivity$d;->b:Lcom/join/mgps/activity/QuarkPromptActivity;

    iget-object v1, v1, Lcom/join/mgps/activity/QuarkPromptActivity;->n:Lcom/join/mgps/dto/WebDiskCfg;

    invoke-virtual {v1}, Lcom/join/mgps/dto/WebDiskCfg;->getDisplay_count()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/QuarkPromptActivity$d;->b:Lcom/join/mgps/activity/QuarkPromptActivity;

    iget-object v1, v1, Lcom/join/mgps/activity/QuarkPromptActivity;->k:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v1}, Lcom/join/mgps/pref/PrefDef_;->quark_display_count()Lorg/androidannotations/api/sharedpreferences/i;

    move-result-object v1

    add-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 4
    :cond_0
    sget-object v0, Lcom/MApplication;->x:Lcom/MApplication;

    iget-object v1, p0, Lcom/join/mgps/activity/QuarkPromptActivity$d;->b:Lcom/join/mgps/activity/QuarkPromptActivity;

    iget-object v2, v1, Lcom/join/mgps/activity/QuarkPromptActivity;->q:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-static {v1}, Lcom/join/mgps/activity/QuarkPromptActivity;->g0(Lcom/join/mgps/activity/QuarkPromptActivity;)Lcom/join/mgps/dto/CollectionBeanSub;

    move-result-object v1

    invoke-static {v0, v2, v1}, Lcom/join/mgps/Util/UtilsMy;->Q0(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;Lcom/join/mgps/dto/CollectionBeanSub;)V

    return-void
.end method
