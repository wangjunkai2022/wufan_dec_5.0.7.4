.class Lcom/join/mgps/activity/QuarkLoadingActivity$b;
.super Ljava/lang/Thread;
.source "QuarkLoadingActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/activity/QuarkLoadingActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field private b:Z

.field c:Ljava/util/Random;

.field d:I

.field e:I

.field f:I

.field g:I

.field h:I

.field final synthetic i:Lcom/join/mgps/activity/QuarkLoadingActivity;


# direct methods
.method public constructor <init>(Lcom/join/mgps/activity/QuarkLoadingActivity;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/QuarkLoadingActivity$b;->i:Lcom/join/mgps/activity/QuarkLoadingActivity;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lcom/join/mgps/activity/QuarkLoadingActivity$b;->b:Z

    .line 3
    new-instance p1, Ljava/util/Random;

    invoke-direct {p1}, Ljava/util/Random;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/activity/QuarkLoadingActivity$b;->c:Ljava/util/Random;

    const/16 v0, 0xa

    .line 4
    invoke-virtual {p1, v0}, Ljava/util/Random;->nextInt(I)I

    move-result p1

    add-int/lit8 p1, p1, 0x46

    iput p1, p0, Lcom/join/mgps/activity/QuarkLoadingActivity$b;->d:I

    .line 5
    iget-object p1, p0, Lcom/join/mgps/activity/QuarkLoadingActivity$b;->c:Ljava/util/Random;

    invoke-virtual {p1, v0}, Ljava/util/Random;->nextInt(I)I

    move-result p1

    add-int/lit8 p1, p1, 0x50

    iput p1, p0, Lcom/join/mgps/activity/QuarkLoadingActivity$b;->e:I

    const/4 p1, 0x0

    .line 6
    iput p1, p0, Lcom/join/mgps/activity/QuarkLoadingActivity$b;->f:I

    .line 7
    iput p1, p0, Lcom/join/mgps/activity/QuarkLoadingActivity$b;->g:I

    .line 8
    iput p1, p0, Lcom/join/mgps/activity/QuarkLoadingActivity$b;->h:I

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/activity/QuarkLoadingActivity$b;->b:Z

    return-void
.end method

.method public run()V
    .locals 3

    .line 1
    invoke-super {p0}, Ljava/lang/Thread;->run()V

    .line 2
    :goto_0
    :try_start_0
    iget-boolean v0, p0, Lcom/join/mgps/activity/QuarkLoadingActivity$b;->b:Z

    const/16 v1, 0x64

    if-eqz v0, :cond_2

    iget v0, p0, Lcom/join/mgps/activity/QuarkLoadingActivity$b;->g:I

    if-ge v0, v1, :cond_2

    .line 3
    iget v1, p0, Lcom/join/mgps/activity/QuarkLoadingActivity$b;->f:I

    const/4 v2, 0x3

    if-ge v1, v2, :cond_0

    .line 4
    iget v1, p0, Lcom/join/mgps/activity/QuarkLoadingActivity$b;->d:I

    div-int/2addr v1, v2

    iput v1, p0, Lcom/join/mgps/activity/QuarkLoadingActivity$b;->h:I

    add-int/2addr v0, v1

    .line 5
    iput v0, p0, Lcom/join/mgps/activity/QuarkLoadingActivity$b;->g:I

    goto :goto_1

    :cond_0
    if-lt v1, v2, :cond_1

    const/16 v2, 0xf

    if-ge v1, v2, :cond_1

    .line 6
    iget v1, p0, Lcom/join/mgps/activity/QuarkLoadingActivity$b;->e:I

    iget v2, p0, Lcom/join/mgps/activity/QuarkLoadingActivity$b;->d:I

    sub-int/2addr v1, v2

    div-int/lit8 v1, v1, 0xc

    iput v1, p0, Lcom/join/mgps/activity/QuarkLoadingActivity$b;->h:I

    add-int/2addr v0, v1

    .line 7
    iput v0, p0, Lcom/join/mgps/activity/QuarkLoadingActivity$b;->g:I

    .line 8
    :cond_1
    :goto_1
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkLoadingActivity$b;->i:Lcom/join/mgps/activity/QuarkLoadingActivity;

    iget v1, p0, Lcom/join/mgps/activity/QuarkLoadingActivity$b;->g:I

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/QuarkLoadingActivity;->r0(I)V

    const-wide/16 v0, 0x3e8

    .line 9
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    .line 10
    iget v0, p0, Lcom/join/mgps/activity/QuarkLoadingActivity$b;->f:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/join/mgps/activity/QuarkLoadingActivity$b;->f:I

    goto :goto_0

    .line 11
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/activity/QuarkLoadingActivity$b;->i:Lcom/join/mgps/activity/QuarkLoadingActivity;

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/QuarkLoadingActivity;->r0(I)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V

    :goto_2
    return-void
.end method
