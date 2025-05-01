.class Lcom/join/mgps/activity/MiniGameLoadingActivity$g;
.super Ljava/lang/Thread;
.source "MiniGameLoadingActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/activity/MiniGameLoadingActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "g"
.end annotation


# instance fields
.field private b:Z

.field final synthetic c:Lcom/join/mgps/activity/MiniGameLoadingActivity;


# direct methods
.method public constructor <init>(Lcom/join/mgps/activity/MiniGameLoadingActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity$g;->c:Lcom/join/mgps/activity/MiniGameLoadingActivity;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity$g;->b:Z

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity$g;->b:Z

    return-void
.end method

.method public run()V
    .locals 7

    .line 1
    invoke-super {p0}, Ljava/lang/Thread;->run()V

    .line 2
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "progress1 \u5f00\u59cb"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 3
    :try_start_0
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    const/16 v1, 0xa

    .line 4
    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v2

    add-int/lit8 v2, v2, 0x46

    .line 5
    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x50

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 6
    :goto_0
    iget-boolean v5, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity$g;->b:Z

    const/16 v6, 0x64

    if-eqz v5, :cond_2

    if-ge v3, v6, :cond_2

    const/4 v5, 0x3

    if-ge v4, v5, :cond_0

    int-to-float v5, v2

    const/high16 v6, 0x40400000    # 3.0f

    :goto_1
    div-float/2addr v5, v6

    int-to-float v3, v3

    add-float/2addr v3, v5

    float-to-int v3, v3

    goto :goto_2

    :cond_0
    if-lt v4, v5, :cond_1

    const/16 v5, 0xf

    if-ge v4, v5, :cond_1

    sub-int v5, v0, v2

    int-to-float v5, v5

    const/high16 v6, 0x41400000    # 12.0f

    goto :goto_1

    .line 7
    :cond_1
    iput-boolean v1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity$g;->b:Z

    .line 8
    :goto_2
    iget-object v5, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity$g;->c:Lcom/join/mgps/activity/MiniGameLoadingActivity;

    invoke-virtual {v5, v3}, Lcom/join/mgps/activity/MiniGameLoadingActivity;->R0(I)V

    add-int/lit8 v4, v4, 0x1

    const-wide/16 v5, 0x3e8

    .line 9
    invoke-static {v5, v6}, Ljava/lang/Thread;->sleep(J)V

    goto :goto_0

    .line 10
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity$g;->c:Lcom/join/mgps/activity/MiniGameLoadingActivity;

    invoke-virtual {v0, v6}, Lcom/join/mgps/activity/MiniGameLoadingActivity;->R0(I)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V

    :goto_3
    return-void
.end method
