.class Lcom/join/mgps/activity/DownloadSettingActivity$a;
.super Ljava/lang/Object;
.source "DownloadSettingActivity.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/DownloadSettingActivity;->j0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Z

.field final synthetic c:Lcom/join/mgps/activity/DownloadSettingActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/DownloadSettingActivity;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/DownloadSettingActivity$a;->c:Lcom/join/mgps/activity/DownloadSettingActivity;

    iput-boolean p2, p0, Lcom/join/mgps/activity/DownloadSettingActivity$a;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/DownloadSettingActivity$a;->c:Lcom/join/mgps/activity/DownloadSettingActivity;

    invoke-static {p1}, Lcom/join/mgps/pref/h;->n(Landroid/content/Context;)Lcom/join/mgps/pref/h;

    move-result-object p1

    iget-boolean p2, p0, Lcom/join/mgps/activity/DownloadSettingActivity$a;->b:Z

    xor-int/lit8 p2, p2, 0x1

    invoke-virtual {p1, p2}, Lcom/join/mgps/pref/h;->k0(Z)V

    .line 3
    iget-object p1, p0, Lcom/join/mgps/activity/DownloadSettingActivity$a;->c:Lcom/join/mgps/activity/DownloadSettingActivity;

    iget-object p1, p1, Lcom/join/mgps/activity/DownloadSettingActivity;->n:Landroid/widget/ImageView;

    const p2, 0x7f0806ed

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void
.end method
