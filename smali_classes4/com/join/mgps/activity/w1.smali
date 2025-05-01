.class public final synthetic Lcom/join/mgps/activity/w1;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic b:Lcom/join/mgps/activity/ModGameIndexActivity;

.field public final synthetic c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

.field public final synthetic d:Lcom/join/mgps/pref/PrefDef_;


# direct methods
.method public synthetic constructor <init>(Lcom/join/mgps/activity/ModGameIndexActivity;Lcom/github/snowdream/android/app/downloader/DownloadTask;Lcom/join/mgps/pref/PrefDef_;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/activity/w1;->b:Lcom/join/mgps/activity/ModGameIndexActivity;

    iput-object p2, p0, Lcom/join/mgps/activity/w1;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iput-object p3, p0, Lcom/join/mgps/activity/w1;->d:Lcom/join/mgps/pref/PrefDef_;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/join/mgps/activity/w1;->b:Lcom/join/mgps/activity/ModGameIndexActivity;

    iget-object v1, p0, Lcom/join/mgps/activity/w1;->c:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iget-object v2, p0, Lcom/join/mgps/activity/w1;->d:Lcom/join/mgps/pref/PrefDef_;

    invoke-static {v0, v1, v2}, Lcom/join/mgps/activity/ModGameIndexActivity;->f0(Lcom/join/mgps/activity/ModGameIndexActivity;Lcom/github/snowdream/android/app/downloader/DownloadTask;Lcom/join/mgps/pref/PrefDef_;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
