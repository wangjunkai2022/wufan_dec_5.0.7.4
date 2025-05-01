.class Lcom/join/mgps/activity/hideapp/HideAppHomeActivity$b;
.super Ljava/lang/Object;
.source "HideAppHomeActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/activity/hideapp/HideAppHomeActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field private a:I

.field private b:Ljava/lang/String;

.field private c:I

.field final synthetic d:Lcom/join/mgps/activity/hideapp/HideAppHomeActivity;


# direct methods
.method public constructor <init>(Lcom/join/mgps/activity/hideapp/HideAppHomeActivity;ILjava/lang/String;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/hideapp/HideAppHomeActivity$b;->d:Lcom/join/mgps/activity/hideapp/HideAppHomeActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p2, p0, Lcom/join/mgps/activity/hideapp/HideAppHomeActivity$b;->a:I

    .line 3
    iput-object p3, p0, Lcom/join/mgps/activity/hideapp/HideAppHomeActivity$b;->b:Ljava/lang/String;

    .line 4
    iput p4, p0, Lcom/join/mgps/activity/hideapp/HideAppHomeActivity$b;->c:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/activity/hideapp/HideAppHomeActivity$b;->c:I

    return v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppHomeActivity$b;->b:Ljava/lang/String;

    return-object v0
.end method

.method public c(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/activity/hideapp/HideAppHomeActivity$b;->c:I

    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/hideapp/HideAppHomeActivity$b;->b:Ljava/lang/String;

    return-void
.end method

.method public e(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/activity/hideapp/HideAppHomeActivity$b;->a:I

    return-void
.end method

.method public getType()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/activity/hideapp/HideAppHomeActivity$b;->a:I

    return v0
.end method
