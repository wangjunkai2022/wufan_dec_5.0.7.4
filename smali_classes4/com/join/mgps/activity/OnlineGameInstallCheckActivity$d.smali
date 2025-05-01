.class Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$d;
.super Ljava/lang/Object;
.source "OnlineGameInstallCheckActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field private a:I

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Z

.field final synthetic e:Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;


# direct methods
.method public constructor <init>(Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;ILjava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$d;->e:Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p2, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$d;->a:I

    .line 3
    iput-object p3, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$d;->b:Ljava/lang/String;

    .line 4
    iput-object p4, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$d;->c:Ljava/lang/String;

    .line 5
    iput-boolean p5, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$d;->d:Z

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$d;->c:Ljava/lang/String;

    return-object v0
.end method

.method public b()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$d;->a:I

    return v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$d;->b:Ljava/lang/String;

    return-object v0
.end method

.method public d()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$d;->d:Z

    return v0
.end method

.method public e(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$d;->d:Z

    return-void
.end method

.method public f(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$d;->c:Ljava/lang/String;

    return-void
.end method

.method public g(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$d;->a:I

    return-void
.end method

.method public h(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$d;->b:Ljava/lang/String;

    return-void
.end method
