.class final Lcom/bytedance/pangle/plugin/b$2$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/bytedance/pangle/a/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/pangle/plugin/b$2;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/Map;

.field final synthetic b:Lcom/bytedance/pangle/plugin/b$2;


# direct methods
.method constructor <init>(Lcom/bytedance/pangle/plugin/b$2;Ljava/util/Map;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/pangle/plugin/b$2$1;->b:Lcom/bytedance/pangle/plugin/b$2;

    iput-object p2, p0, Lcom/bytedance/pangle/plugin/b$2$1;->a:Ljava/util/Map;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/bytedance/pangle/plugin/b$2$1;->b:Lcom/bytedance/pangle/plugin/b$2;

    iget-object v1, v0, Lcom/bytedance/pangle/plugin/b$2;->b:Ljava/lang/String;

    iget v2, v0, Lcom/bytedance/pangle/plugin/b$2;->c:I

    iget-object v3, p0, Lcom/bytedance/pangle/plugin/b$2$1;->a:Ljava/util/Map;

    iget-object v0, v0, Lcom/bytedance/pangle/plugin/b$2;->d:Ljava/lang/StringBuffer;

    invoke-static {v1, v2, v3, v0}, Lcom/bytedance/pangle/plugin/b;->a(Ljava/lang/String;ILjava/util/Map;Ljava/lang/StringBuffer;)V

    return-void
.end method
