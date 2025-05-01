.class Lcom/join/mgps/customview/c$c;
.super Ljava/lang/Object;
.source "ForumExtFuncPopWindow_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/customview/c;->i(IZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:Z

.field final synthetic d:Lcom/join/mgps/customview/c;


# direct methods
.method constructor <init>(Lcom/join/mgps/customview/c;IZ)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/c$c;->d:Lcom/join/mgps/customview/c;

    iput p2, p0, Lcom/join/mgps/customview/c$c;->b:I

    iput-boolean p3, p0, Lcom/join/mgps/customview/c$c;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/c$c;->d:Lcom/join/mgps/customview/c;

    iget v1, p0, Lcom/join/mgps/customview/c$c;->b:I

    iget-boolean v2, p0, Lcom/join/mgps/customview/c$c;->c:Z

    invoke-static {v0, v1, v2}, Lcom/join/mgps/customview/c;->u(Lcom/join/mgps/customview/c;IZ)V

    return-void
.end method
