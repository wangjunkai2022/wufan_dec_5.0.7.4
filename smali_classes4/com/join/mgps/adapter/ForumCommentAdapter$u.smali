.class Lcom/join/mgps/adapter/ForumCommentAdapter$u;
.super Landroid/text/style/ClickableSpan;
.source "ForumCommentAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/adapter/ForumCommentAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "u"
.end annotation


# instance fields
.field private b:Landroid/content/Context;

.field private c:Ljava/lang/String;

.field final synthetic d:Lcom/join/mgps/adapter/ForumCommentAdapter;


# direct methods
.method public constructor <init>(Lcom/join/mgps/adapter/ForumCommentAdapter;Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$u;->d:Lcom/join/mgps/adapter/ForumCommentAdapter;

    invoke-direct {p0}, Landroid/text/style/ClickableSpan;-><init>()V

    .line 2
    iput-object p2, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$u;->b:Landroid/content/Context;

    .line 3
    iput-object p3, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$u;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$u;->b:Landroid/content/Context;

    iget-object v1, p0, Lcom/join/mgps/adapter/ForumCommentAdapter$u;->c:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lcom/join/mgps/Util/IntentUtil;->goShareWebActivity(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method
